package example.scala.practice

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object FutureExample extends App {

//  val x = Future {
//    Thread.sleep(500)
//    10 + 10
//  }

  //val futureValue = Await.result(x, 1.seconds) // blocking

  //println(futureValue)

  // non blocking

  def add(x: Int, y: Int): Future[Int] = Future {
    x + y
  }

  def sub(x: Int, y: Int): Future[Int] = Future {
    x - y
  }

  def startNonBlockingCode(): Unit = {
    val addF = add(10, 20)
    val subF = sub(30, 20)

    val finalResult = for {
      addResult <- addF.map(e => { println("getting it"); e })
      subResult <- subF
    } yield {
      println("Getting result")
      addResult + subResult

    }

    finalResult.onComplete {
      case Success(value) =>
        println(s"Final result is $value")
      case Failure(exception) => println("Oops error")
    }
  }
  startNonBlockingCode()

}
