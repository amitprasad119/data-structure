package example.hof

object CustomFormatter extends App {

  def curriedFormatter(s: String) (num: Double) = s.format(num)
  val nums: Seq[Double] = List(1.23434,13344.34566,2123.234,455.2)
  nums.map(curriedFormatter("%4.3f") _).foreach{println}
//  def byName(x: => Int) = x + 1
//  def byFun(fn : () => Int) = fn() + 1
//
//  def method = 42
//  def anotherMethod() = 42
//
//  println("1." + byFun(method _))
//  println("2." + byFun(anotherMethod _))
//  println("3." + byName(method))
}
