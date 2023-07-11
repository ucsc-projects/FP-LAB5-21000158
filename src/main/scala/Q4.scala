import scala.io.StdIn

object Q4 {
  def main(args: Array[String]): Unit = {
    print("Please input an integer: ")
    val inp = StdIn.readInt()
    oddOrEven(inp)
  }

  def oddOrEven(a:Int){
    if (a%2==0){
      println("Even")
    }else{
      println("Odd")
    }
  }
}
