
def main(args: Array[String]): Unit = {
  println("Hello, world!")
  val a = new Main()

  println(
    a.add(1, 2)
  )
}

class Main {
  def add(a: Int, b: Int): Int = a + b
}