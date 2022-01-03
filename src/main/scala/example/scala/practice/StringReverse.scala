package example.scala.practice

import scala.annotation.tailrec

object StringReverse extends App {

  def reverseString(str: String): String = {
    @tailrec
    def doReverse(str: String, reverse: String = ""): String = {
      if (str.isEmpty) {
        return reverse
      }
      doReverse(str.substring(0, str.length - 1), reverse = reverse + str.charAt(str.length - 1))
    }
    doReverse(str)
  }
  //println(reverseString("this is a book of java"))
  val str = "This is a book of java"
  val x = str.split(" ")

  def reverseWord(arr: Array[String], end: Int, result: String = ""): String = {
    if (end < 0)
      return result

    reverseWord(arr, end - 1, result + arr(end) + " ")
  }
  println(reverseWord(x, x.length - 1).mkString)
}
