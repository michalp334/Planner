import java.util.Date

class Day(val date: Date) extends ParseDate {
  val n = 10 //Day is created with n empty fields - n could be in future configurable
  val taskContainer = Vector.fill(n) { new Task }

  def print: Unit = {
    println("   Day:" + formatter.format(date))
    println("   Task         Duration")
    //use index of taskContainer for printing
    for (task <- taskContainer.zipWithIndex) {
      println("%d  %s   %s".format(task._2 + 1, task._1.name, task._1.interval.getOrElse("").toString))
    }
  }

  def addTask: Unit = {
    taskContainer :+ new Task
  }
}