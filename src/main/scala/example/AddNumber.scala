package example

object AddNumber extends App {

  def addNumber(num: Int): Int = {

    def doAdd(num: Int, rem: Int, acc: Int): Int = {
      if (num == 0) {
        return acc + rem
      }
      doAdd(num / 10, num % 10, acc + rem)
    }
    doAdd(num, 0, 0)
  }

  List(123, 456, 789, 100, 234).map(addNumber).foreach(println)
}
