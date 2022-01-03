package example.implicitsexp

object ImplicitExample extends App {
  /**
   *  convert a method impllicit to use it
   */
//  case class Employee(name:String) {
//    def greet : String = s"Hello $name"
//  }
//  implicit def greetMessage(name:String) : Employee =  Employee(name)
//  println("Amit".greet)
//  implicit def stringToDouble(str:String)  = str.toDouble
//  val x :Double = ("67.90d")
//  println(x + 10d)
  // Pimp my library
  implicit class Converter(val stringValue:String)  {
    def convertStringToInt = Integer.parseInt(stringValue)
  }

  println("42".convertStringToInt)

}
