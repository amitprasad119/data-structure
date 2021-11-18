package example.partialfn

object PartialFunctionExample extends App {
  implicit val p = println()
  val partialFnAnonymous = (x:Int) => x match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case 4 => "Four"
  }
  val partialFn:PartialFunction[Int,String] = {
    case 1 =>"One"
    case 2 =>"Two"
    case 3 => "Three"
    case 4 => "Four"
  }
  val chatBot:PartialFunction[String,String] = {
    case "Hi" => "Hello"
    case "How are you" => "I am fine , How are you?"
    case "I am fine" => "Glad to hear that"
    case "Okay" => "Good bye for now!"
  }

println(partialFnAnonymous(1))
println(partialFn(3))
 scala.io.Source.stdin.getLines().map(chatBot).foreach(println)
}
