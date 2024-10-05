package lectures.week1base

object Expressions extends App {
  val aVal = 1 + 2 * 3
  println(1 + 2 * 3)
  
  val aCondition = true
  
  val ifExpressionValue = if (aCondition) "True Condition" else "False Condition"
  println(ifExpressionValue)
  
  println(if(aCondition) "True Condition" else "False Condition")

  val someVal = print("It is just a value")
  print(someVal)

  val someValue = {
    1 < 0
    2 == 5
    4 < 9
  }

  val someCodeBlock = {
    if (someValue) 1 else 0
    1
  }

  println(someCodeBlock)
  }
