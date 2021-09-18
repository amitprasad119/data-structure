

object WorkBook extends App {

  // @tailrec
   def factorial(n:Int,acc:BigInt = 1) : BigInt ={
    if(n == 0)
      return acc
      factorial( n-1, n * acc)
   }
 // val l = new mutable.LinkedHashMap[Int,Int](5,.75f,true)
  println(factorial(1000))

}
