

object WorkBook extends App {

  val mappedName = Map("Amrita" -> "1","John" ->2,"Sagar" -> "9")
   def greet(name: String) {
     mappedName.get(name) match {
       case Some(_) => println("Hello " +name)
       case _ => println("Hello, Who are you ?")
     }
   }

  println(greet("Amrita"))

  List("Amit","Sumit","Amrita").map(greet)
}
