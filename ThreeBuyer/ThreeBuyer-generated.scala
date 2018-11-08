// Global type (from /home/osboxes/Desktop/ThreeBuyer.scr)
//    seller->alice{PlayAlice(seller⊕{Title(String).seller&{QuoteA(Int).bob⊕{ShareA(Int).bob&{OkA(Unit).end, QuitA(Unit).end}}}}).end}

// -----------------------------------------------------
// Local type for role alice:
//    seller&{PlayAlice(seller⊕{Title(String).seller&{QuoteA(Int).bob⊕{ShareA(Int).bob&{OkA(Unit).end, QuitA(Unit).end}}}}).end}
package test.proto.alice

import scala.concurrent.duration.Duration
import lchannels._

// Input message types for multiparty sessions
case class PlayAlice(p: MPTitle)
case class QuoteA(p: Int, cont: MPShareA)
sealed abstract class MsgMPOkAOrQuitA
case class OkA(p: Unit) extends MsgMPOkAOrQuitA
case class QuitA(p: Unit) extends MsgMPOkAOrQuitA

// Output message types for multiparty sessions
case class Title(p: String)
case class ShareA(p: Int)

// Multiparty session classes
case class MPPlayAlice(seller: In[binary.PlayAlice]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    seller.receive(timeout) match {
      case m @ binary.PlayAlice(p) => {
        PlayAlice(p)
      }
    }
  }
}
case class MPTitle(bob: Out[binary.ShareA], seller: Out[binary.Title]) {
  def send(v: Title) = {
    val cnt = seller !! binary.Title(v.p)_
    MPQuoteA(bob, cnt)
  }
}
case class MPQuoteA(bob: Out[binary.ShareA], seller: In[binary.QuoteA]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    seller.receive(timeout) match {
      case m @ binary.QuoteA(p) => {
        QuoteA(p, MPShareA(bob, ()))
      }
    }
  }
}
case class MPShareA(bob: Out[binary.ShareA], seller: Unit) {
  def send(v: ShareA) = {
    val cnt = bob !! binary.ShareA(v.p)_
    MPOkAOrQuitA(cnt, seller)
  }
}
case class MPOkAOrQuitA(bob: In[binary.OkAOrQuitA], seller: Unit) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    bob.receive(timeout) match {
      case m @ binary.OkA(p) => {
        OkA(p)
      }
      case m @ binary.QuitA(p) => {
        QuitA(p)
      }
    }
  }
}

// Classes representing messages (with continuations) in binary sessions
package object binary {
case class Title(p: String)(val cont: Out[QuoteA])
case class QuoteA(p: Int)
case class ShareA(p: Int)(val cont: Out[OkAOrQuitA])
sealed abstract class OkAOrQuitA
case class OkA(p: Unit) extends OkAOrQuitA
case class QuitA(p: Unit) extends OkAOrQuitA
case class PlayAlice(p: MPTitle)
}
// -----------------------------------------------------

// -----------------------------------------------------
// Local type for role seller:
//    alice⊕{PlayAlice(seller⊕{Title(String).seller&{QuoteA(Int).bob⊕{ShareA(Int).bob&{OkA(Unit).end, QuitA(Unit).end}}}}).end}
package test.proto.seller

import scala.concurrent.duration.Duration
import lchannels._

// Input message types for multiparty sessions
case class QuoteA(p: Int, cont: MPShareA)
sealed abstract class MsgMPOkAOrQuitA
case class OkA(p: Unit) extends MsgMPOkAOrQuitA
case class QuitA(p: Unit) extends MsgMPOkAOrQuitA

// Output message types for multiparty sessions
case class PlayAlice(p: MPTitle)
case class Title(p: String)
case class ShareA(p: Int)

// Multiparty session classes
case class MPPlayAlice(alice: Out[binary.PlayAlice]) {
  def send(v: PlayAlice) = {
    val cnt = alice ! binary.PlayAlice(v.p)
    ()
  }
}
case class MPTitle(bob: Out[binary.ShareA], seller: Out[binary.Title]) {
  def send(v: Title) = {
    val cnt = seller !! binary.Title(v.p)_
    MPQuoteA(bob, cnt)
  }
}
case class MPQuoteA(bob: Out[binary.ShareA], seller: In[binary.QuoteA]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    seller.receive(timeout) match {
      case m @ binary.QuoteA(p) => {
        QuoteA(p, MPShareA(bob, ()))
      }
    }
  }
}
case class MPShareA(bob: Out[binary.ShareA], seller: Unit) {
  def send(v: ShareA) = {
    val cnt = bob !! binary.ShareA(v.p)_
    MPOkAOrQuitA(cnt, seller)
  }
}
case class MPOkAOrQuitA(bob: In[binary.OkAOrQuitA], seller: Unit) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    bob.receive(timeout) match {
      case m @ binary.OkA(p) => {
        OkA(p)
      }
      case m @ binary.QuitA(p) => {
        QuitA(p)
      }
    }
  }
}

// Classes representing messages (with continuations) in binary sessions
package object binary {
case class Title(p: String)(val cont: Out[QuoteA])
case class QuoteA(p: Int)
case class ShareA(p: Int)(val cont: Out[OkAOrQuitA])
sealed abstract class OkAOrQuitA
case class OkA(p: Unit) extends OkAOrQuitA
case class QuitA(p: Unit) extends OkAOrQuitA
case class PlayAlice(p: MPTitle)
}
// -----------------------------------------------------

