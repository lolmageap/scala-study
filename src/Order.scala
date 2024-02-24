import scala.sys.error

/**
 * trait 은 Java 의 interface 와 비슷 하다.
 * 하지만 trait 은 Java 의 interface 와 다르게 생성자 를 가질 수 있다.
 * (Java 의 interface 는 생성자 를 가질 수 없다.)
 */
trait Order {
  def < (that: Any): Boolean
  def <= (that: Any): Boolean = (this < that) || (this == that)
  def > (that: Any): Boolean = !(this <= that)
  def >= (that: Any): Boolean = !(this < that)
}

class Date(y: Int, m: Int, d: Int) extends Order {
  def year = y

  def month = m

  def day = d

  override def toString: String = s"$year-$month-$day"

  override def <(that: Any): Boolean = {
    if (!that.isInstanceOf[Date])
      error("cannot compare " + that + " and a Date")

    val o = that.asInstanceOf[Date]

    (year < o.year) || (year == o.year && (month < o.month || (month == o.month && day < o.day)))
  }

}