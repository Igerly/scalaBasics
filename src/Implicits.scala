import java.text.SimpleDateFormat
import java.text.DateFormat
import java.util.Date


object Implicits extends App {
  
  implicit val formatter = new SimpleDateFormat("yyyy-MM-dd")
  
  def format(date: Date)(implicit dateFormat: DateFormat) = {
    dateFormat.format(date)
  }
  
  println(format(new Date()))
  
}