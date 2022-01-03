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

  def reverseStringV2(s: String): String = {
    if (s.isEmpty)
      return ""
    reverseStringV2(s.substring(1)) + s.charAt(0)
  }
  println(reverseString("Hello", ""))
  println(reverseStringV2("Hello"))

  def fib(n: Int): Int = {
    def calculateFib(n: Int): Int = {
      if (n <= 1) {
        return n
      }

      calculateFib(n - 1) + calculateFib(n - 2)
    }
    calculateFib(n)
  }
  for (i <- 0 until 10)
    println(fib(i))

}
