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

  //def someFunc(): Int = 2 * someFunc() + 1
  //def callSomeFunc(x: Int, y: => Int) = println(x)

  //callSomeFunc(someFunc(), 1)

  // исправьте код
  def aCondition(): Boolean = if (1 < 2) true else false
  def multiply(z: Int): Int = z * 2
  def someFunc(x: Int, y: => Int): Int = {
    if (aCondition()) x * 3
    else multiply(y)
  }
  println(someFunc(8, 9))
}
