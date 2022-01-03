package example.scala.practice

class CompanionExample {
  def add(x: Int, y: Int) = x + y
}

object CompanionExample {
  def apply(name: String): CompanionExample = new CompanionExample()

  def main(args: Array[String]): Unit = {
    println(reverseString("Hello"))
  }

  def reverseString(str: String): String = {
    def doReverse(str: String, reverse: String = ""): String = {
      if (str.isEmpty) {
        return ""
      }
      doReverse(str.substring(0, str.length - 1), reverse = reverse + str.charAt(str.length - 1))
    }
    doReverse(str)
  }

}

object Runner extends App {
  implicit class Printer(x: Int) {
    def letsPrint(fn: => Unit) = fn
  }
  val com = CompanionExample("Amit")
  com.add(10, 20)

}
