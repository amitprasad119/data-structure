package example

import io.circe
import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}
import io.circe.parser
import io.circe.syntax._

object Message extends App {
  implicit val measurementDecoder = deriveDecoder[Message]
  implicit val measurementEncoder = deriveEncoder[Message]

  def fromJson(jsonString: String): Either[circe.Error, Message] =
    parser.decode[Message](jsonString)

  println(Message(10, "Amit").toJson())
  val stringJson = """{"id":10,"text":"Amit"}"""
  val m = parser.decode[Message](stringJson)
  m match {
    case Left(e) => println("Error")
    case Right(data) =>
      println(data.id)
      println(data.text)
  }

}

case class Message(id: Int, text: String) {
  import Message._
  val x: Message = this
  def toJson() = (this).asJson.noSpaces

//  def toJson2() =
//    this.asJson.noSpaces // compile error: No implicit arguments of type: Encoder[Message.this.type]

}
