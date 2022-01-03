object WorkBook extends App {
  val wb = new WorkBook("Amit", "Prasad")
  println(wb.firstName)
  wb.firstName = "sumit"
  println(wb.getFullName)

}

class WorkBook(var firstName: String, val lastName: String) {

  def getFullName = firstName + lastName
}
