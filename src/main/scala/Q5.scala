import scala.io.StdIn

object Q5 {
  def main(args: Array[String]): Unit = {
    print("Please input an integer: ")
    val inp = StdIn.readInt()
    println(addOddNumbers(inp))
  }

  def isOdd(a: Int): Boolean = {
    if (a % 2 == 0) {
      false
    } else {
      true
    }
  }

  def addOddNumbers(a: Int): Int = {
    if (a <= 1) {
      return 1
    }
    var sum: Int = 0
    if (isOdd(a)) {
      sum = sum + a
    }
    sum + addOddNumbers(a - 1)
  }

}
