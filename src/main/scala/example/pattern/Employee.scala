package example.pattern

case class Employee (name:String,age:Int)

object Employee {

  def unapply(employee:Employee) : Option[(String,Int)] =  {
    println("Under unapply method")
    Some(employee.name,employee.age)
  }
  def unapply(age:Int) : Option[String] = {
    if(age < 10)   return  Some("single digit")
    if(age % 2 == 0) return Some("even number")
    Some("No propery")
  }
}

object Driver extends App {
  val amit = Employee("Amit",10)
   amit match {
     case Employee(name,age) => println(s"Hey there I'm $name and I'm $age yo.")
  }
 def greetings(greet:String, name:String,`question?`: String): Unit =  {
   println(greet + " " + name + " , " + `question?`)
 }
   //powerfulness of _
  def insertName: String => Unit = greetings("Hello", _:String, "How are you? ")


   /*
    Custom match over case class data
    */
  amit.age match {
    case Employee(result) => println(result)
    case _ => println("Not sure")
  }



}