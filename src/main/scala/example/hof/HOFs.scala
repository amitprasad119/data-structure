package example.hof

object HOFs extends App{
  def doubler(x: Int) = x * 2
  def triplet(x: Int) = x * 3

  def getOps(c:Int): Int => Int =  c match {
    case 2 => doubler
    case 3 =>  triplet
    case _ => throw new Exception("Not applicable number")
  }

  def hofExamp(fn:Int => Int =>Int, x:Int):Int =>Int = fn(x)
  val x: Int => Int =  hofExamp(getOps,3)
  println(x(9))

  //============ Part 2 ==== Bit complex
  //             param => another fn = {expression}
  val superAdder: Int => Int => Int = (x:Int) => (y:Int) => x + y
  val superDuperAdder: Int => Int => Int => Int = (x:Int) => (y:Int) => (z:Int) => x + y + z
  val superDuperAdder1: Int => (Int,Int) => Int => Int = (x:Int) => (y:Int,q:Int) => (z:Int) => x + y + z

  val partResult = superAdder(10)

  println(partResult(10))

 def circuit(fn:Int => Int => Int => Int,x: Int,y:Int,z:Int): Int => Int => Int = fn(x)

println(circuit(superDuperAdder,10,20,30))

trait Equality[T] {
  def isEqual(value1:T, value2: T ) : Boolean
}



}
