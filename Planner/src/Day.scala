import java.util.Date

class Day(val date:Date) extends ParseDate {
  val n=10 //Day is created with n empty fields - n could be in future configurable
  var TaskContainer = Vector.fill(n){new Task}
  def print {
    println("   Day:" + formatter.format(date))
    println("   Task         Duration" )
    var i=1
    for(Task<-TaskContainer){
      println("%d  %s 	%s".format(i, Task.name, Task.interval.getOrElse("").toString))
      i+=1
    }
  }
  
  def addTask ={
    TaskContainer :+ new Task
  }
}