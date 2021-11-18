import scala.annotation.tailrec

object CubeCalculator extends App {

  def cube(x: Int): Int = if (x < 0) throw new Exception else x * x * x

  @tailrec
  def reverseString(s: String, acc: String): String = {
    println(s)
    if (s.isEmpty) {
      return acc
    }
    reverseString(s.substring(0, s.length - 1), acc.concat(s.charAt(s.length - 1).toString))
  }
  println(reverseString("Hello", ""))
}
