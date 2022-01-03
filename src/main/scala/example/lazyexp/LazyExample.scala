package example.lazyexp

import scala.collection.WithFilter

object LazyExample extends App {
  lazy val x:Int = throw  new RuntimeException
   lazy  val age:Int  = {
     println("I'm inside age block")
     29
   }
  println(age)
  println(age)

  /**
   *  withFilter uses lazy evaluation of the data
   */
  lazy  val millionsRecord  = (1 to 1000000).toList
   def isEven(x:Int) = {
    println(s"Number is $x ")
    x % 2 == 0
  }
   millionsRecord.filter(isEven).foreach(println)
  scala.io.StdIn.readLine()
 val lazyFilter: WithFilter[Int, List] =  millionsRecord.withFilter( isEven)
  println(lazyFilter)
  lazyFilter.foreach{println}
 // NOTE : for-comprehension uses the withFilter internally in guard condition

}
