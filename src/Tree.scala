
/**
 * scala 의 case class 는 kotlin 의 data class 와 유사 하다.
 * 하지만 scala 의 case class 는 상속을 받을 수 있다.
 * (kotlin 의 data class 는 상속을 받을 수 없다. 하지만 kotlin 의 data class 는 data class 나 interface 를 상속 받을 수 있다.)
 */
object Tree {
  /**
   * scala 에서는 함수에 type alias 를 사용 할 수 있다.
   */
  private type Environment = String => Int

   def main(args: Array[String]): Unit = {

      val tree = Node(
        Root(1),
        Node(
          Leaf(2),
          Leaf(3),
        ),
      )

     val summary = TreeFactory.total(tree)
     assert { summary == 6 }

     val maximum = TreeFactory.max(tree)
     assert(maximum == 3, {
         s"maximum should be 3, but was $maximum"
       })

     val env: Environment = { case "x" => 5 case "y" => 7 }
     println(env("x"))
   }

}

abstract class Tree {}
case class Node(left: Tree, right: Tree) extends Tree
case class Root(x: Int) extends Tree
case class Leaf(x: Int) extends Tree

object TreeFactory {

  def total(tree: Tree): Int = tree match {
    case Node(left, right) => total(left) + total(right)
    case Root(value) => value
    case Leaf(value) => value
  }

  def max(tree: Tree): Int = tree match {
    case Node(left, right) => max(left) max max(right)
    case Root(value) => value
    case Leaf(value) => value
  }
}
