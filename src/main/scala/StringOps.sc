import scala.collection.mutable

val a = "this is a book of scala and java".split(" ")

a.map(_.capitalize)


val num = "123a"

def isDigit(num:String) = num.forall(Character.isDigit)

println(isDigit(num))

val oneToFive = new PartialFunction[Int,String] {
  val nums = Array("One","Two","Three","Four","Five")
  def apply(i:Int) = nums(i-1)
  override def isDefinedAt(i: Int): Boolean =  i >=1 &&  i <= 5
}

val sixToEleven = new PartialFunction[Int,String] {
  val nums = Array("six","seven","eight","nine","ten","eleven")
  override def apply(i: Int): String = nums(i-6)
  override def isDefinedAt(i: Int): Boolean = i >= 6 && i <= 11
}

val handle1to11 = oneToFive orElse sixToEleven

handle1to11(3)
handle1to11(7)

List(1,2,3).map(handle1to11)

trait One {
  def show() = {
    println("This is one")
  }
}

trait Two extends One  {
 override def show(): Unit = {
    println("This is two")
  }
}

trait Three extends One  {
  override def show(): Unit = {
    println("This is three")
  }
}

class Four extends Three with Two


    val f =  new Four
    f.show()

var hashMap = mutable.HashMap("C"->"Csharp", "S"->"Scala", "J"->"Java")
hashMap.put("name","amit")
println(hashMap)
hashMap + ("project" -> "sephora")






