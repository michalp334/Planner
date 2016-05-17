import java.util.Date

object Planner extends App with ParseDate {

  var Days = Map[Date, Day]() //map to store all days created by user

  def addDay(dateText: String): Unit = {
    val date = ParseDate(dateText)
    if (date.isSuccess) Days += (date.get -> new Day(date.get))
    else println("Uncorrect date format")
  }

  def printOnStart: Unit = {
    val sortedDays = Days.toList.sortBy { _._1 } //on the start of the program print the earliest day (for now)
    val (key, value) = sortedDays.head
    Days(key).print
  }

  //roboczy test
  addDay("10/05/2016")
  var day = Days(ParseDate("10/05/2016").get)
  day.taskContainer(1).name = "do sth"
  day.taskContainer(1).modifyInterval(Some("14:05"), Some("16:30"))
  //koniec testu

  printOnStart

}