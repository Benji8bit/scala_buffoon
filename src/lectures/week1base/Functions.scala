package lectures.week1base

object Functions extends App {
  def aPerson(name: String, surname: String): String = {
    s"$name $surname"
  }
  println(aPerson("John", "Smith"))

  def aParameterlessFunction(): Unit = println("Function with no parameters")

  aParameterlessFunction()
  //aParameterlessFunction
  
  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }
  
  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }
  
  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
