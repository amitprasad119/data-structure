package example.scala.practice

object PimpMyLibrary extends App {

  class RichInt(x: Int) {
    def isEven: Boolean = x % 2 == 0
  }

  // Just check if any number is even and we will follow tradition approach here

  println(new RichInt(17).isEven)
  // Now let's pimp the INT type by adding implicits to RichInt class

  implicit class RichIntImplicit(x: Int) {
    def isEven: Boolean = x % 2 == 0
    def time(fn: => Unit) = for (_ <- 0 to x) fn
  }

  println(42.isEven)
  5.time(println("hello"))

  /*
  if we notice 42 is directly calling method isEven which compiler internally converts to
   new RichIntImplicit(n).isEven
   There should be only one parameters in class when we use it as pimping or implicit class
   */

  // Create a String class and enrich with asInt,encrypt

  implicit class StringRich(str: String) {
    def toNumber: Int = Integer.valueOf(str)
    def encrypt: String = str.toCharArray.map(ch => (ch + 2).toChar).mkString
  }

  println("Number Conversion:" + "123".toNumber)
  println("String encrypt:" + "Amit".encrypt)
  println(3.time(println("Hello")))

  // implicits on Int

  implicit def convert(x: String): Int = Integer.valueOf(x)
  println("5" / 2)

  implicit class MathOperations(x: Int) {

    def +(x: Int): Int = {
      println("inside add..")
      this.x + x
    }
  }

  println(2.+(8))

}
