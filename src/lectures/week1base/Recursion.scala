package lectures.week1base

object Recursion extends App {

  var i = 0
  while (i < 3) {
    println("hello")
    i += 1
  }

  //def factorial(n: Int): Int = {
  //  if (n <= 0) 1
  //  else n * factorial(n-1)
  //}
  //println(factorial(4))

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else {
      println(s"Имеем число $n, для которого считаем факториал ${n - 1}")
      var res = n * factorial(n - 1)
      println(s"Вычислили факториал $n")

      res
    }
  }
  factorial(3)
}
