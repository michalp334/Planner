import net.time4j._
import net.time4j.range._
import net.time4j.range.ClockInterval.between

class Interval(start:String=null, end:String=null) {
  val interval:ClockInterval = between(toTime(start), toTime(end)) //val because modifying Interval in task wil construct new Interval
  
   def toTime(hours:String):PlainTime = {
     var array = hours.split(":")
     var h:Int = array(0).toInt
     var m:Int = array(1).toInt
     PlainTime.of(h,m)
    }
  
  override def toString = interval.toString.replaceAll ("/", "- ").replaceAll("[^0-9:-]", "")
}