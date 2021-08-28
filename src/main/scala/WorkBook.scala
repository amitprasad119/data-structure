object WorkBook {


  def tailrecSum(n:Int, runningTotal:Int = 0): Int =   {
    if (n == 0) {
       runningTotal
    } else {
       tailrecSum(n - 1, runningTotal + n)
    }
  }


  println(tailrecSum(10))
}
