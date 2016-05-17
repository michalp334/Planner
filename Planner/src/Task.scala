
class Task {
  var name: String = ""
  var interval: Option[Interval] = None

  def modifyInterval(start: Option[String], end: Option[String]): Option[Interval] = {
    interval = Some(new Interval(start, end))
    interval
  }
}
