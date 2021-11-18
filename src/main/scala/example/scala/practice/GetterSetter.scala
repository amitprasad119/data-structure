package example.scala.practice

class GetterSetter {
  private var internalValue:Int =0
  private var internalValue1:Int =0

  def id  = internalValue
  def id_=(newValue:Int):Unit ={ internalValue = newValue }

}

object GetterSetter extends App{
  val gs = new GetterSetter
   gs.internalValue = 10
  println(gs.internalValue)
}
