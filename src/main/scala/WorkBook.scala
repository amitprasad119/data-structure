object WorkBook extends App{

  def isPrime(n:Int) :Boolean = {
    for(i <- 2 until n) {
      if(i % 2 == 0) return false
    }
     true
  }
  println(isPrime(11))
}
