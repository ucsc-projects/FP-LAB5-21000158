import scala.io.StdIn

object Q5 {
  def main(args: Array[String]): Unit = {
    print("Please input an integer: ")
    val inp = StdIn.readInt()
    println(addEvenNumbers(inp))
  }

  def isEven(a: Int): Boolean = {
    if (a % 2 == 0) {
      false
    } else {
      true
    }
  }

  def addEvenNumbers(a: Int): Int = {
    if (a <= 1) {
      return 0
    }
    var sum: Int = 0
    if (!isEven(a)) {
      sum = sum + a
    }
    sum + addEvenNumbers(a - 1)
  }

}
