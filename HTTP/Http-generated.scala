// Global type (from /home/osboxes/Desktop/http.scr)
//    c->s{Request(RequestLine).μ(X).c->s{AcceptEncodings(String).X, Accept(String).X, DoNotTrack(Boolean).X, UpgradeIR(Boolean).X, UserAgent(String).X, Connection(String).X, AcceptLanguage(String).X, Host(String).X, RequestBody(Body).s->c{HttpVersion(Version).s->c{Code404(String).μ(Http_ResponseMain___c__s_).s->c{Server(String).Http_ResponseMain___c__s_, ETag(String).Http_ResponseMain___c__s_, ContentLength(Integer).Http_ResponseMain___c__s_, Vary(String).Http_ResponseMain___c__s_, ContentType(String).Http_ResponseMain___c__s_, StrictTS(String).Http_ResponseMain___c__s_, Via(String).Http_ResponseMain___c__s_, Date(ZonedDateTime).Http_ResponseMain___c__s_, LastModified(ZonedDateTime).Http_ResponseMain___c__s_, AcceptRanges(String).Http_ResponseMain___c__s_, ResponseBody(Body).end}, Code200(String).μ(Http_ResponseMain___c__s_1).s->c{Server(String).Http_ResponseMain___c__s_1, ETag(String).Http_ResponseMain___c__s_1, ContentLength(Integer).Http_ResponseMain___c__s_1, Vary(String).Http_ResponseMain___c__s_1, ContentType(String).Http_ResponseMain___c__s_1, StrictTS(String).Http_ResponseMain___c__s_1, Via(String).Http_ResponseMain___c__s_1, Date(ZonedDateTime).Http_ResponseMain___c__s_1, LastModified(ZonedDateTime).Http_ResponseMain___c__s_1, AcceptRanges(String).Http_ResponseMain___c__s_1, ResponseBody(Body).end}}}}}

// -----------------------------------------------------
// Local type for role s:
//    c&{Request(RequestLine).μ(X).c&{AcceptEncodings(String).X, Accept(String).X, DoNotTrack(Boolean).X, UpgradeIR(Boolean).X, Connection(String).X, UserAgent(String).X, AcceptLanguage(String).X, Host(String).X, RequestBody(Body).c⊕{HttpVersion(Version).c⊕{Code404(String).μ(Http_ResponseMain___c__s_).c⊕{ETag(String).Http_ResponseMain___c__s_, Server(String).Http_ResponseMain___c__s_, ContentLength(Integer).Http_ResponseMain___c__s_, ContentType(String).Http_ResponseMain___c__s_, Vary(String).Http_ResponseMain___c__s_, Via(String).Http_ResponseMain___c__s_, StrictTS(String).Http_ResponseMain___c__s_, ResponseBody(Body).end, AcceptRanges(String).Http_ResponseMain___c__s_, LastModified(ZonedDateTime).Http_ResponseMain___c__s_, Date(ZonedDateTime).Http_ResponseMain___c__s_}, Code200(String).μ(Http_ResponseMain___c__s_1).c⊕{ETag(String).Http_ResponseMain___c__s_1, Server(String).Http_ResponseMain___c__s_1, ContentLength(Integer).Http_ResponseMain___c__s_1, ContentType(String).Http_ResponseMain___c__s_1, Vary(String).Http_ResponseMain___c__s_1, Via(String).Http_ResponseMain___c__s_1, StrictTS(String).Http_ResponseMain___c__s_1, ResponseBody(Body).end, AcceptRanges(String).Http_ResponseMain___c__s_1, LastModified(ZonedDateTime).Http_ResponseMain___c__s_1, Date(ZonedDateTime).Http_ResponseMain___c__s_1}}}}}
package test.proto.s

import scala.concurrent.duration.Duration
import lchannels._

// Input message types for multiparty sessions
case class Request(p: RequestLine, cont: MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent)
sealed abstract class MsgMPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent

case class AcceptEncodings(p: String, cont: MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent) extends MsgMPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
case class Accept(p: String, cont: MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent) extends MsgMPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
case class DoNotTrack(p: Boolean, cont: MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent) extends MsgMPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
case class UpgradeIR(p: Boolean, cont: MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent) extends MsgMPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
case class Connection(p: String, cont: MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent) extends MsgMPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
case class UserAgent(p: String, cont: MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent) extends MsgMPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
case class AcceptLanguage(p: String, cont: MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent) extends MsgMPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
case class Host(p: String, cont: MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent) extends MsgMPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
case class RequestBody(p: Body, cont: MPHttpVersion) extends MsgMPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent

// Output message types for multiparty sessions
case class HttpVersion(p: Version)
case class Code404(p: String)
case class Code200(p: String)
case class ETag(p: String)
case class Server(p: String)
case class ContentLength(p: Integer)
case class ContentType(p: String)
case class Vary(p: String)
case class Via(p: String)
case class StrictTS(p: String)
case class ResponseBody(p: Body)
case class AcceptRanges(p: String)
case class LastModified(p: ZonedDateTime)
case class Date(p: ZonedDateTime)

// Multiparty session classes
case class MPRequest(c: In[binary.Request]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    c.receive(timeout) match {
      case m @ binary.Request(p) => {
        Request(p, MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(m.cont))
      }
    }
  }
}
case class MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(c: In[binary.AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    c.receive(timeout) match {
      case m @ binary.Accept(p) => {
        Accept(p, MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(m.cont))
      }
      case m @ binary.AcceptEncodings(p) => {
        AcceptEncodings(p, MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(m.cont))
      }
      case m @ binary.AcceptLanguage(p) => {
        AcceptLanguage(p, MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(m.cont))
      }
      case m @ binary.Connection(p) => {
        Connection(p, MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(m.cont))
      }
      case m @ binary.DoNotTrack(p) => {
        DoNotTrack(p, MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(m.cont))
      }
      case m @ binary.Host(p) => {
        Host(p, MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(m.cont))
      }
      case m @ binary.RequestBody(p) => {
        RequestBody(p, MPHttpVersion(m.cont))
      }
      case m @ binary.UpgradeIR(p) => {
        UpgradeIR(p, MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(m.cont))
      }
      case m @ binary.UserAgent(p) => {
        UserAgent(p, MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(m.cont))
      }
    }
  }
}
case class MPHttpVersion(c: Out[binary.HttpVersion]) {
  def send(v: HttpVersion) = {
    val cnt = c !! binary.HttpVersion(v.p)_
    MPCode200OrCode404(cnt)
  }
}
case class MPCode200OrCode404(c: Out[binary.Code200OrCode404]) {
  def send(v: Code200) = {
    val cnt = c !! binary.Code200(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
  def send(v: Code404) = {
    val cnt = c !! binary.Code404(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
}
case class MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(c: Out[binary.AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) {
  def send(v: AcceptRanges) = {
    val cnt = c !! binary.AcceptRanges(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
  def send(v: ContentLength) = {
    val cnt = c !! binary.ContentLength(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
  def send(v: ContentType) = {
    val cnt = c !! binary.ContentType(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
  def send(v: Date) = {
    val cnt = c !! binary.Date(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
  def send(v: ETag) = {
    val cnt = c !! binary.ETag(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
  def send(v: LastModified) = {
    val cnt = c !! binary.LastModified(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
  def send(v: ResponseBody) = {
    val cnt = c ! binary.ResponseBody(v.p)
    ()
  }
  def send(v: Server) = {
    val cnt = c !! binary.Server(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
  def send(v: StrictTS) = {
    val cnt = c !! binary.StrictTS(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
  def send(v: Vary) = {
    val cnt = c !! binary.Vary(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
  def send(v: Via) = {
    val cnt = c !! binary.Via(v.p)_
    MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(cnt)
  }
}

// Classes representing messages (with continuations) in binary sessions
package object binary {
  case class Request(p: RequestLine)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent])
  sealed abstract class AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class Accept(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class AcceptEncodings(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class AcceptLanguage(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class Connection(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class DoNotTrack(p: Boolean)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class Host(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class RequestBody(p: Body)(val cont: Out[HttpVersion]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class HttpVersion(p: Version)(val cont: In[Code200OrCode404])
  sealed abstract class Code200OrCode404
  case class Code200(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends Code200OrCode404
  sealed abstract class AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class AcceptRanges(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class ContentLength(p: Integer)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class ContentType(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class Date(p: ZonedDateTime)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class ETag(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class LastModified(p: ZonedDateTime)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class ResponseBody(p: Body) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class Server(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class StrictTS(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class Vary(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class Via(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class Code404(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends Code200OrCode404
  case class UpgradeIR(p: Boolean)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class UserAgent(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
}
// -----------------------------------------------------

// -----------------------------------------------------
// Local type for role c:
//    s⊕{Request(RequestLine).μ(X).s⊕{AcceptEncodings(String).X, Accept(String).X, DoNotTrack(Boolean).X, UpgradeIR(Boolean).X, Connection(String).X, UserAgent(String).X, AcceptLanguage(String).X, Host(String).X, RequestBody(Body).s&{HttpVersion(Version).s&{Code404(String).μ(Http_ResponseMain___c__s_).s&{ETag(String).Http_ResponseMain___c__s_, Server(String).Http_ResponseMain___c__s_, ContentLength(Integer).Http_ResponseMain___c__s_, ContentType(String).Http_ResponseMain___c__s_, Vary(String).Http_ResponseMain___c__s_, Via(String).Http_ResponseMain___c__s_, StrictTS(String).Http_ResponseMain___c__s_, ResponseBody(Body).end, AcceptRanges(String).Http_ResponseMain___c__s_, LastModified(ZonedDateTime).Http_ResponseMain___c__s_, Date(ZonedDateTime).Http_ResponseMain___c__s_}, Code200(String).μ(Http_ResponseMain___c__s_1).s&{ETag(String).Http_ResponseMain___c__s_1, Server(String).Http_ResponseMain___c__s_1, ContentLength(Integer).Http_ResponseMain___c__s_1, ContentType(String).Http_ResponseMain___c__s_1, Vary(String).Http_ResponseMain___c__s_1, Via(String).Http_ResponseMain___c__s_1, StrictTS(String).Http_ResponseMain___c__s_1, ResponseBody(Body).end, AcceptRanges(String).Http_ResponseMain___c__s_1, LastModified(ZonedDateTime).Http_ResponseMain___c__s_1, Date(ZonedDateTime).Http_ResponseMain___c__s_1}}}}}
package test.proto.c

import scala.concurrent.duration.Duration
import lchannels._

// Input message types for multiparty sessions
case class HttpVersion(p: Version, cont: MPCode200OrCode404)
sealed abstract class MsgMPCode200OrCode404
case class Code404(p: String, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPCode200OrCode404
case class Code200(p: String, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPCode200OrCode404
sealed abstract class MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class ETag(p: String, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class Server(p: String, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class ContentLength(p: Integer, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class ContentType(p: String, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class Vary(p: String, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class Via(p: String, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class StrictTS(p: String, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class ResponseBody(p: Body) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class AcceptRanges(p: String, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class LastModified(p: ZonedDateTime, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
case class Date(p: ZonedDateTime, cont: MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia) extends MsgMPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia

// Output message types for multiparty sessions
case class Request(p: RequestLine)
case class AcceptEncodings(p: String)
case class Accept(p: String)
case class DoNotTrack(p: Boolean)
case class UpgradeIR(p: Boolean)
case class Connection(p: String)
case class UserAgent(p: String)
case class AcceptLanguage(p: String)
case class Host(p: String)
case class RequestBody(p: Body)

// Multiparty session classes
case class MPRequest(s: Out[binary.Request]) {
  def send(v: Request) = {
    val cnt = s !! binary.Request(v.p)_
    MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(cnt)
  }
}
case class MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(s: Out[binary.AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) {
  def send(v: Accept) = {
    val cnt = s !! binary.Accept(v.p)_
    MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(cnt)
  }
  def send(v: AcceptEncodings) = {
    val cnt = s !! binary.AcceptEncodings(v.p)_
    MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(cnt)
  }
  def send(v: AcceptLanguage) = {
    val cnt = s !! binary.AcceptLanguage(v.p)_
    MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(cnt)
  }
  def send(v: Connection) = {
    val cnt = s !! binary.Connection(v.p)_
    MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(cnt)
  }
  def send(v: DoNotTrack) = {
    val cnt = s !! binary.DoNotTrack(v.p)_
    MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(cnt)
  }
  def send(v: Host) = {
    val cnt = s !! binary.Host(v.p)_
    MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(cnt)
  }
  def send(v: RequestBody) = {
    val cnt = s !! binary.RequestBody(v.p)_
    MPHttpVersion(cnt)
  }
  def send(v: UpgradeIR) = {
    val cnt = s !! binary.UpgradeIR(v.p)_
    MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(cnt)
  }
  def send(v: UserAgent) = {
    val cnt = s !! binary.UserAgent(v.p)_
    MPAcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent(cnt)
  }
}
case class MPHttpVersion(s: In[binary.HttpVersion]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    s.receive(timeout) match {
      case m @ binary.HttpVersion(p) => {
        HttpVersion(p, MPCode200OrCode404(m.cont))
      }
    }
  }
}
case class MPCode200OrCode404(s: In[binary.Code200OrCode404]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    s.receive(timeout) match {
      case m @ binary.Code200(p) => {
        Code200(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
      case m @ binary.Code404(p) => {
        Code404(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
    }
  }
}
case class MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(s: In[binary.AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) {
  def receive(implicit timeout: Duration = Duration.Inf) = {
    s.receive(timeout) match {
      case m @ binary.AcceptRanges(p) => {
        AcceptRanges(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
      case m @ binary.ContentLength(p) => {
        ContentLength(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
      case m @ binary.ContentType(p) => {
        ContentType(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
      case m @ binary.Date(p) => {
        Date(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
      case m @ binary.ETag(p) => {
        ETag(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
      case m @ binary.LastModified(p) => {
        LastModified(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
      case m @ binary.ResponseBody(p) => {
        ResponseBody(p)
      }
      case m @ binary.Server(p) => {
        Server(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
      case m @ binary.StrictTS(p) => {
        StrictTS(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
      case m @ binary.Vary(p) => {
        Vary(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
      case m @ binary.Via(p) => {
        Via(p, MPAcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia(m.cont))
      }
    }
  }
}

// Classes representing messages (with continuations) in binary sessions
package object binary {
  case class Request(p: RequestLine)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent])
  sealed abstract class AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class Accept(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class AcceptEncodings(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class AcceptLanguage(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class Connection(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class DoNotTrack(p: Boolean)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class Host(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class RequestBody(p: Body)(val cont: Out[HttpVersion]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class HttpVersion(p: Version)(val cont: In[Code200OrCode404])
  sealed abstract class Code200OrCode404
  case class Code200(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends Code200OrCode404
  sealed abstract class AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class AcceptRanges(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class ContentLength(p: Integer)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class ContentType(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class Date(p: ZonedDateTime)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class ETag(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class LastModified(p: ZonedDateTime)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class ResponseBody(p: Body) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class Server(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class StrictTS(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class Vary(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class Via(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia
  case class Code404(p: String)(val cont: In[AcceptRangesOrContentLengthOrContentTypeOrDateOrETagOrLastModifiedOrResponseBodyOrServerOrStrictTSOrVaryOrVia]) extends Code200OrCode404
  case class UpgradeIR(p: Boolean)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
  case class UserAgent(p: String)(val cont: In[AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent]) extends AcceptOrAcceptEncodingsOrAcceptLanguageOrConnectionOrDoNotTrackOrHostOrRequestBodyOrUpgradeIROrUserAgent
}
// -----------------------------------------------------
