package lectures.week1base

object Functions extends App {
  def aPerson(name: String, surname: String): String = {
    s"$name $surname"
  }

  println(aPerson("John", "Smith"))
}
