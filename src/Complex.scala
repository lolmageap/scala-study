
/**
 * scala 에서는 클래스 를 정의 할 수 있다.
 * 클래스 는 생성자 를 가질 수 있다.
 */
object Complex {
  def main(args: Array[String]): Unit = {
    val complex = new Complex(1.2, 3.4)

    println("real part: " + complex.getReal)
    //    println("real part: " + complex.getReal()) <- compile error

    println("imaginary part1: " + complex.getImaginary)
    println("imaginary part2: " + complex.getImaginary())
  }
}

/**
 * scala 에서는 함수를 정의 할 때 리턴 타입을 생략 할 수 있다.
 * scala 에서는 함수를 정의 할 때 매개 변수가 없을 경우 괄호를 생략 할 수 있다. (생략을 하게 된다면 호출 할 때도 괄호를 생략 해야 한다.)
 */
class Complex(val real: Double, val imaginary: Double) {

  def getReal: Double = real.ensuring(cond = true, "real part")
  def getImaginary(): Double = imaginary.round
}