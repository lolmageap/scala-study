
/**
 * scala 는 함수를 변수로 사용할 수 있다.
 */
object Timer {
  def main(args: Array[String]): Unit = {
    timeFlies // same as timeFlies()
    oncePerSecond(timeFlies)
//    oncePerSecond { timeFlies }
//    oncePerSecond { () => println("time flies like an arrow...") }
  }

  private def oncePerSecond(callback: () => Unit): Unit = {
    while (true) { callback(); Thread sleep 1000 }
  }

  private def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }
}
