package lectures.week1base

object Recursion extends App {

  var i = 0
  while (i < 3) {
    println("hello")
    i += 1
  }

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n-1)
  }
  println(factorial(3))
}
