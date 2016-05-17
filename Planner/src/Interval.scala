import net.time4j._
import net.time4j.range._
import net.time4j.range.ClockInterval.between
import scala.util.{ Try, Success, Failure }

class Interval(start: Option[String] = None, end: Option[String] = None) {
  require(start != None, end != None)

  val interval: ClockInterval = between(toTime(start.get), toTime(end.get))

  def toTime(hours: String): PlainTime = {
    val array = hours.split(":")
    val h: Int = array(0).toInt
    val m: Int = array(1).toInt
    PlainTime.of(h, m)
  }

  override def toString = interval.toString.replaceAll("/", "- ").replaceAll("[^0-9:-]", "")
}
