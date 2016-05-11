import java.util.Date


object Planner extends App with ParseDate {
  
   var Days = Map[Date, Day]() //map to store all days created by user
   
  def addDay(dateText: String) =  {
    var date = ParseDate(dateText)
    if ( date.isSuccess) Days += (date.get -> new Day(date.get))
    else println ("Uncorrect date format" )
  }
 
  def printOnStart = {
  var temp = Days.toList.sortBy{_._1} //on the start of the program print the earliest day (for now)
  val (key, value) = temp.head
  Days(key).print
  }
  
 
  //roboczy test
  addDay("10/05/2016")
  var temp = Days(ParseDate("10/05/2016").get)
  temp.TaskContainer(1).name="do sth"
  temp.TaskContainer(1).modifyInterval("14:05", "16:30")
  //koniec testu
  
  printOnStart
  
  
}
