package example.scala.practice
/***
based on the type parameters implicits are invoked for comparison
Line 44,45,46 are the example
To create the type class Equality[T] should have companion object which we are creating at line 30
 */
object TypeClass extends App {

  case class User(name:String,age:Int,email:String)
  trait Equal[T] {
    def compare(ths:T,that:T) : Boolean
  }

  object NameEquality extends Equal[User] {
    override def compare(ths: User, that: User): Boolean = ths.name == that.name
  }

  object AgeEquality extends Equal[User] {
    override def compare(ths: User, that: User): Boolean = ths.age == that.age
  }

  //println( AgeEquality.compare(User("Amit",29,"abc@gmail.com"),User("Amit",29,"this@gmail.com")))
  //println( NameEquality.compare(User("Amit",29,"abc@gmail.com"),User("Amit1",29,"this@gmail.com")))

  trait Equality[T] {
    def isEqual(value1: T, value2: T): Boolean
  }

  object Equality  {
    def isEqual[T](value1 :T , value2 : T) (implicit equality: Equality[T]) = equality.isEqual(value1,value2)
  }

  implicit object StringEquality extends Equality[String] {
    override def isEqual(value1: String, value2: String): Boolean = value1.compareTo(value2)  == 0
  }

  implicit object  IntEquality extends Equality[Int] {
    override def isEqual(value1: Int, value2: Int): Boolean = value1 == value2
  }

  implicit object DoubleEquality extends Equality[Double] {
    override def isEqual(value1: Double, value2: Double): Boolean = value1 == value2
  }
  println("StringEquality:" + Equality.isEqual("Amit","Amit"))
  println("IntEquality:" + Equality.isEqual(10,20))
  println("DoubleEquality:" + Equality.isEqual(10d,10d))

}