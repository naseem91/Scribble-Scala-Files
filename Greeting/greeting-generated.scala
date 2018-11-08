// Global type (from /home/osboxes/Desktop/greeting.scr)
//    μ(Greeting_Proto___c__s_).c->s{Greet(String).s->c{Hello(String).Greeting_Proto___c__s_, Bye(String).end}, Quit(Unit).end}

// -----------------------------------------------------
// Local type for role s:
//    μ(Greeting_Proto___c__s_).c&{Greet(String).c⊕{Hello(String).Greeting_Proto___c__s_, Bye(String).end}, Quit(Unit).end}
package test.proto.s

import scala.concurrent.duration.Duration
import lchannels._

// Input message types for multiparty sessions
sealed abstract class MsgMPGreetOrQuit
case class Greet(p: String, cont: MPByeOrHello) extends MsgMPGreetOrQuit
case class Quit(p: Unit) extends MsgMPGreetOrQuit

// Output message types for multiparty sessions
case class Hello(p: String)
case class Bye(p: String)

// Multiparty session classes
case class MPGreetOrQuit(c: In[binary.GreetOrQuit]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    c.receive(timeout) match {
      case m @ binary.Greet(p) => {
        Greet(p, MPByeOrHello(m.cont))
      }
      case m @ binary.Quit(p) => {
        Quit(p)
      }
    }
  }
}
case class MPByeOrHello(c: Out[binary.ByeOrHello]) {
  def send(v: Bye) = {
    val cnt = c ! binary.Bye(v.p)
    ()
  }
  def send(v: Hello) = {
    val cnt = c !! binary.Hello(v.p)_
    MPGreetOrQuit(cnt)
  }
}

// Classes representing messages (with continuations) in binary sessions
package object binary {
sealed abstract class GreetOrQuit
case class Greet(p: String)(val cont: Out[ByeOrHello]) extends GreetOrQuit
sealed abstract class ByeOrHello
case class Bye(p: String) extends ByeOrHello
case class Hello(p: String)(val cont: Out[GreetOrQuit]) extends ByeOrHello
case class Quit(p: Unit) extends GreetOrQuit
}
// -----------------------------------------------------

// -----------------------------------------------------
// Local type for role c:
//    μ(Greeting_Proto___c__s_).s⊕{Greet(String).s&{Hello(String).Greeting_Proto___c__s_, Bye(String).end}, Quit(Unit).end}
package test.proto.c

import scala.concurrent.duration.Duration
import lchannels._

// Input message types for multiparty sessions
sealed abstract class MsgMPByeOrHello
case class Hello(p: String, cont: MPGreetOrQuit) extends MsgMPByeOrHello
case class Bye(p: String) extends MsgMPByeOrHello

// Output message types for multiparty sessions
case class Greet(p: String)
case class Quit(p: Unit)

// Multiparty session classes
case class MPGreetOrQuit(s: Out[binary.GreetOrQuit]) {
  def send(v: Greet) = {
    val cnt = s !! binary.Greet(v.p)_
    MPByeOrHello(cnt)
  }
  def send(v: Quit) = {
    val cnt = s ! binary.Quit(v.p)
    ()
  }
}
case class MPByeOrHello(s: In[binary.ByeOrHello]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    s.receive(timeout) match {
      case m @ binary.Bye(p) => {
        Bye(p)
      }
      case m @ binary.Hello(p) => {
        Hello(p, MPGreetOrQuit(m.cont))
      }
    }
  }
}

// Classes representing messages (with continuations) in binary sessions
package object binary {
sealed abstract class GreetOrQuit
case class Greet(p: String)(val cont: Out[ByeOrHello]) extends GreetOrQuit
sealed abstract class ByeOrHello
case class Bye(p: String) extends ByeOrHello
case class Hello(p: String)(val cont: Out[GreetOrQuit]) extends ByeOrHello
case class Quit(p: Unit) extends GreetOrQuit
}
// -----------------------------------------------------

