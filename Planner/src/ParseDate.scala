 import java.text.SimpleDateFormat
 import java.util.Date
 import scala.util.Try

trait ParseDate {
   def  formatter:SimpleDateFormat = new SimpleDateFormat("dd/mm/yyyy")
   def ParseDate(dateText: String) = Try(formatter.parse(dateText))
}