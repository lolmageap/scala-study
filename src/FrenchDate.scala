import java.text.DateFormat
import java.util.{Date, Locale}
import java.text.DateFormat._

/**
 * scala 에서 Import 를 사용 하여 Java 의 패키지 를 사용할 수 있다.
 */
object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = new Date
    val df: DateFormat = getDateInstance(LONG, Locale.FRANCE)

    println(df format now)
  }
}
