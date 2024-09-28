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
}
