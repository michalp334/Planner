import java.text.SimpleDateFormat
import java.util.Date
import scala.util.Try

trait ParseDate {
  val formatter: SimpleDateFormat = new SimpleDateFormat("dd/mm/yyyy")
  def ParseDate(dateText: String): Try[Date] = Try(formatter.parse(dateText))
}