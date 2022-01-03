package example.catshandson

import cats.implicits._
import cats.kernel.Eq

object CatsEqExample extends App {

  // let's use Eq For comparison since we want to have compile time error when different types are mapped
  val eqInstance = Eq[Int]
//  implicit val optionInstances: Eq[Option[Int]] = Eq[Option[Int]]

  println(eqInstance.eqv(12, 12)) // will return true
  // println(optionInstances.eqv(Some(1), Some(2))) // will return false

  // we can enable === also from cats.implicits._
  println("Hello" === "Hello")

  //we can have Type class for match as well on user defined classes
  case class User(name: String, age: Int)

  implicit val eqUser: Eq[User] = Eq[User] {
    case (user1, user2) =>
      user1.age === user2.age
  }

  println(User("Amit", 29) === User("Sumit", 29)) // here comparing with the use of implicit Eq

}
