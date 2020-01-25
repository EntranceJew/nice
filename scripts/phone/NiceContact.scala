//decompiled from PlayerContact.class
package scripts.phone

import scala.reflect.ScalaSignature
import scala.util.continuations._

@ScalaSignature(bytes = "\u0006\u0001\u00192A!\u0001\u0002\u0001\u000f\ti\u0001\u000b\\1zKJ\u001cuN\u001c;bGRT!a\u0001\u0003\u0002\u000bADwN\\3\u000b\u0003\u0015\tqa]2sSB$8o\u0001\u0001\u0014\u0005\u0001A\u0001CA\u0005\u000b\u001b\u0005\u0011\u0011BA\u0006\u0003\u0005I\u0001\u0006n\u001c8f\u0007>tG/Y2u'\u000e\u0014\u0018\u000e\u001d;\t\u000b5\u0001A\u0011\u0001\b\u0002\rqJg.\u001b;?)\u0005y\u0001CA\u0005\u0001\u0011\u0015\t\u0002\u0001\"\u0011\u0013\u0003\u0011\u0019\u0017\r\u001c7\u0015\u0003MQ#\u0001\u0006\u000e\u0011\u0005UAR\"\u0001\f\u000b\u0003]\tQa]2bY\u0006L!!\u0007\f\u0003\u000f\t{w\u000e\\3b].\n1\u0004\u0005\u0003\u001dC\r\u001aS\"A\u000f\u000b\u0005yy\u0012!D2p]RLg.^1uS>t7O\u0003\u0002!-\u0005!Q\u000f^5m\u0013\t\u0011SD\u0001\u0005daN\u0004\u0016M]1n!\t)B%\u0003\u0002&-\t!QK\\5u\u0001")
class NiceContact extends PhoneContactScript {
  override def call(): Boolean @cps[Unit] = {
    showText("Nice.")
    true
  }
}