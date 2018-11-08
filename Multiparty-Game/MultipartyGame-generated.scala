// Global type (from /home/osboxes/Desktop/Multiparty-Game.scr)
//    q->p{PlayA(c&{InfoCA(String).b⊕{InfoAB(String).μ(t).b⊕{Mov1AB(Int).c&{Mov1CA(Int).t, Mov2CA(Boolean).t}, Mov2AB(Boolean).c&{Mov1CA(Int).t, Mov2CA(Boolean).t}}}}).end}

// -----------------------------------------------------
// Local type for role p:
//    q&{PlayA(c&{InfoCA(String).b⊕{InfoAB(String).μ(t).b⊕{Mov1AB(Int).c&{Mov1CA(Int).t, Mov2CA(Boolean).t}, Mov2AB(Boolean).c&{Mov1CA(Int).t, Mov2CA(Boolean).t}}}}).end}
package test.proto.p

import scala.concurrent.duration.Duration
import lchannels._

// Input message types for multiparty sessions
case class PlayA(p: MPInfoCA)
case class InfoCA(p: String, cont: MPInfoAB)
sealed abstract class MsgMPMov1CAOrMov2CA
case class Mov1CA(p: Int, cont: MPMov1ABOrMov2AB) extends MsgMPMov1CAOrMov2CA
case class Mov2CA(p: Boolean, cont: MPMov1ABOrMov2AB) extends MsgMPMov1CAOrMov2CA

// Output message types for multiparty sessions
case class InfoAB(p: String)
case class Mov1AB(p: Int)
case class Mov2AB(p: Boolean)

// Multiparty session classes
case class MPPlayA(q: In[binary.PlayA]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    q.receive(timeout) match {
      case m @ binary.PlayA(p) => {
        PlayA(p)
      }
    }
  }
}
case class MPInfoCA(b: Out[binary.InfoAB], c: In[binary.InfoCA]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    c.receive(timeout) match {
      case m @ binary.InfoCA(p) => {
        InfoCA(p, MPInfoAB(b, m.cont))
      }
    }
  }
}
case class MPInfoAB(b: Out[binary.InfoAB], c: In[binary.Mov1CAOrMov2CA]) {
  def send(v: InfoAB) = {
    val cnt = b !! binary.InfoAB(v.p)_
    MPMov1ABOrMov2AB(cnt, c)
  }
}
case class MPMov1ABOrMov2AB(b: Out[binary.Mov1ABOrMov2AB], c: In[binary.Mov1CAOrMov2CA]) {
  def send(v: Mov1AB) = {
    val cnt = b !! binary.Mov1AB(v.p)_
    MPMov1CAOrMov2CA(cnt, c)
  }
  def send(v: Mov2AB) = {
    val cnt = b !! binary.Mov2AB(v.p)_
    MPMov1CAOrMov2CA(cnt, c)
  }
}
case class MPMov1CAOrMov2CA(b: Out[binary.Mov1ABOrMov2AB], c: In[binary.Mov1CAOrMov2CA]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    c.receive(timeout) match {
      case m @ binary.Mov1CA(p) => {
        Mov1CA(p, MPMov1ABOrMov2AB(b, m.cont))
      }
      case m @ binary.Mov2CA(p) => {
        Mov2CA(p, MPMov1ABOrMov2AB(b, m.cont))
      }
    }
  }
}

// Classes representing messages (with continuations) in binary sessions
package object binary {
case class InfoAB(p: String)(val cont: In[Mov1ABOrMov2AB])
sealed abstract class Mov1ABOrMov2AB
case class Mov1AB(p: Int)(val cont: In[Mov1ABOrMov2AB]) extends Mov1ABOrMov2AB
case class Mov2AB(p: Boolean)(val cont: In[Mov1ABOrMov2AB]) extends Mov1ABOrMov2AB
case class InfoCA(p: String)(val cont: In[Mov1CAOrMov2CA])
sealed abstract class Mov1CAOrMov2CA
case class Mov1CA(p: Int)(val cont: In[Mov1CAOrMov2CA]) extends Mov1CAOrMov2CA
case class Mov2CA(p: Boolean)(val cont: In[Mov1CAOrMov2CA]) extends Mov1CAOrMov2CA
case class PlayA(p: MPInfoCA)
}
// -----------------------------------------------------

// -----------------------------------------------------
// Local type for role q:
//    p⊕{PlayA(c&{InfoCA(String).b⊕{InfoAB(String).μ(t).b⊕{Mov1AB(Int).c&{Mov1CA(Int).t, Mov2CA(Boolean).t}, Mov2AB(Boolean).c&{Mov1CA(Int).t, Mov2CA(Boolean).t}}}}).end}
package test.proto.q

import scala.concurrent.duration.Duration
import lchannels._

// Input message types for multiparty sessions
case class InfoCA(p: String, cont: MPInfoAB)
sealed abstract class MsgMPMov1CAOrMov2CA
case class Mov1CA(p: Int, cont: MPMov1ABOrMov2AB) extends MsgMPMov1CAOrMov2CA
case class Mov2CA(p: Boolean, cont: MPMov1ABOrMov2AB) extends MsgMPMov1CAOrMov2CA

// Output message types for multiparty sessions
case class PlayA(p: MPInfoCA)
case class InfoAB(p: String)
case class Mov1AB(p: Int)
case class Mov2AB(p: Boolean)

// Multiparty session classes
case class MPPlayA(p: Out[binary.PlayA]) {
  def send(v: PlayA) = {
    val cnt = p ! binary.PlayA(v.p)
    ()
  }
}
case class MPInfoCA(b: Out[binary.InfoAB], c: In[binary.InfoCA]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    c.receive(timeout) match {
      case m @ binary.InfoCA(p) => {
        InfoCA(p, MPInfoAB(b, m.cont))
      }
    }
  }
}
case class MPInfoAB(b: Out[binary.InfoAB], c: In[binary.Mov1CAOrMov2CA]) {
  def send(v: InfoAB) = {
    val cnt = b !! binary.InfoAB(v.p)_
    MPMov1ABOrMov2AB(cnt, c)
  }
}
case class MPMov1ABOrMov2AB(b: Out[binary.Mov1ABOrMov2AB], c: In[binary.Mov1CAOrMov2CA]) {
  def send(v: Mov1AB) = {
    val cnt = b !! binary.Mov1AB(v.p)_
    MPMov1CAOrMov2CA(cnt, c)
  }
  def send(v: Mov2AB) = {
    val cnt = b !! binary.Mov2AB(v.p)_
    MPMov1CAOrMov2CA(cnt, c)
  }
}
case class MPMov1CAOrMov2CA(b: Out[binary.Mov1ABOrMov2AB], c: In[binary.Mov1CAOrMov2CA]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    c.receive(timeout) match {
      case m @ binary.Mov1CA(p) => {
        Mov1CA(p, MPMov1ABOrMov2AB(b, m.cont))
      }
      case m @ binary.Mov2CA(p) => {
        Mov2CA(p, MPMov1ABOrMov2AB(b, m.cont))
      }
    }
  }
}

// Classes representing messages (with continuations) in binary sessions
package object binary {
case class InfoAB(p: String)(val cont: In[Mov1ABOrMov2AB])
sealed abstract class Mov1ABOrMov2AB
case class Mov1AB(p: Int)(val cont: In[Mov1ABOrMov2AB]) extends Mov1ABOrMov2AB
case class Mov2AB(p: Boolean)(val cont: In[Mov1ABOrMov2AB]) extends Mov1ABOrMov2AB
case class InfoCA(p: String)(val cont: In[Mov1CAOrMov2CA])
sealed abstract class Mov1CAOrMov2CA
case class Mov1CA(p: Int)(val cont: In[Mov1CAOrMov2CA]) extends Mov1CAOrMov2CA
case class Mov2CA(p: Boolean)(val cont: In[Mov1CAOrMov2CA]) extends Mov1CAOrMov2CA
case class PlayA(p: MPInfoCA)
}
// -----------------------------------------------------

