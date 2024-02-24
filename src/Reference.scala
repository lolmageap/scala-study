
/**
 * scala 에서는 제네릭 클래스 를 아래와 같이 정의 할 수 있다.
 * 제네릭 클래스 는 생성자 를 가질 수 있다.
 */
class Reference[T] {
  private var contents: T = _
  def set(value: T): Unit = { contents = value }
  def get: T = contents
}

object IntegerReference {
  def main(args: Array[String]): Unit = {
    val cell = new Reference[Float]
    cell.set(13.1234f)
    println("Reference contains the half of " + (cell.get * 2))
  }
}
