package example.scala.practice

object ContraVariance extends App {

  class Animal {
    override def toString: String = "I am an animal"
  }

  class Pet extends Animal {
    override def toString: String = s"I'm a pet"
  }

  class Cat(name: String) extends Pet {
    override def toString: String = s"Hi cat $name"
  }

  class Dog(name: String) extends Pet {
    override def toString: String = s"Hi dog $name"
  }

  class Lion(name: String = "King Lion") extends Animal {
    override def toString: String = s"$name"
  }

  class PrintPet[T >: Dog <: Animal](p: T) { // it can accept anything from dog to Pet
    override def toString: String = p.toString
  }

  val dog = new PrintPet[Animal](new Animal)
  // val cat = new PrintPet[Cat](new Cat("Micky"))
  // val lion = new PrintPet[Lion](new Lion())

  println(dog.toString)

  implicit class PimpLib(x: Int) {
    def time(fn: => Unit) = for (_ <- 1 to x) fn
  }
  5.time(println("Amit"))

  def greet(name: String) = s"Hello $name"
  val add = (x: Int, y: Int) => x + y

  def adder(fn: (Int, Int) => Int, a: Int, b: Int): Int = fn(a, b)

  println(adder(add, 10, 20))

}
