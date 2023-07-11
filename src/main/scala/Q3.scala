import scala.io.StdIn

object Q3 {
  def main(args: Array[String]): Unit = {
    print("Please input an integer: ")
    val inp = StdIn.readInt()
    print(sum(5))
  }

  def sum(a: Int): Int = {
    if (a <= 1) {
      return 1
    }
    a + sum(a - 1)
  }
}
