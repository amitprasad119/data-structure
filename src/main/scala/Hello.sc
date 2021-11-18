

val oneToTen = (1 to 10).toList
val oneToFive = (1 to 5).toList
oneToTen.map(_ * 2)

for( i <- oneToTen) yield i
for( i <- oneToTen) yield  i * 2
for( i <- oneToTen if i > 2 ) yield i
for( i <- oneToTen if i > 2) yield i *2

for {
 _1_to_10 <- oneToTen
 _1_to_5  <- oneToFive
} yield (_1_to_5,_1_to_5)

val names = List("amit","prasad","singh","sumit")

names.map(_.capitalize)

//val x: mutable.Map[Int, String] = scala.collection.mutable.Map[Int,String]()
//val imMap: Map[Int, String] = Map[Int,String](1 -> "shekhar")
//
//x += (1 -> "Amit")
//x += (2 -> "Sumit")
//x += (3 -> "Suman")
//imMap ++ Map(4 -> "uma", 6->"robert")
//imMap ++ Map(6 -> "uma", 7->"robert")
////println(imMap)
//
//x.getOrElse(111,"Unknown")


//val nameMap: Seq[Map[String, String]] = List(Map("name" -> "Peter","id" -> "1"),Map("name" -> "John","id" -> "2"),Map("name" -> "Raj","id" -> "5"))
//val addMap: Seq[Map[String, String]] = List(Map("id" -> "1","city" -> "New york"),Map("id" -> "2","city" -> "Bangalore"),Map("id" -> "3","city" -> "Unknown" ))

val list = List(1 -> "Amit",2 -> "Sumit",3 -> "Raj", 6 -> "Tony").toMap
val list2 = List(1 -> "Bangalore", 2->"London",3 -> "Surat",4 -> "Mumbai").toMap

 val keySets =   list.toMap.keySet ++ list2.toMap.keySet
val result = scala.collection.mutable.Map[Int,(String,String)]()
  keySets.map { id =>
    val name = list.getOrElse(id,"Unknown")
    val city = list2.getOrElse(id,"Not on earth")
    result += (id -> (name,city))
  }
println(result)

list.zipWithIndex






val x = scala.collection.mutable.ListBuffer[Int]()
x += 12
x += 24
x.toSeq

val a = "aeiouaeiouAEIOU"
val vowels = "aeiou"
def isVowel(e:Char) = vowels.contains(e)
val x  = a.toLowerCase.count(isVowel)

def inArray(array1: Array[String], array2: Array[String]): Array[String] = {
 array1.flatMap{ e =>
  array2.filter(_.contains(e))
}
}
def tailRec (number:Int,powDigit:Int,acc:Int = 0) : Int = {
  if(number == 0) {
    acc
  }
  else {
    tailRec(number / 10, powDigit,   acc + Math.pow((number % 10),powDigit).toInt)
  }
}
def isNarcissisticNumber(num:Int,num2: Int) = num == num2

println(tailRec(153,3))







































