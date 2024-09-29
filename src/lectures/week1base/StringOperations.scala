package lectures.week1base

object StringOperations extends App {
  val aString: String = "Scala course"
  
  println(aString.length)
  println(aString.charAt(11))
  println(aString.substring(11, 12))
  println(aString.split(" ").toList)
  println(aString.startsWith("Hel"))
  println(aString.replace("e", "a"))
  println(aString.toLowerCase())
  println(aString.toUpperCase())
  println("abcd".reverse)
  println(aString.take(-1))
  
  println(aString.take(5).toUpperCase())
  println(aString.toUpperCase().substring(0, 5))
  println(aString.substring(0, 5).toUpperCase())
  println(aString.replace("a", "").take(3).reverse)
  
  val aNumber = "42".toInt
  println(aNumber)
  println(aNumber.getClass)
  
  println('1' +: "42" :+ '3')
  println('a' +: "bc" :+ 'd')
  println("a" ++ "bc" :++ "d")
}
