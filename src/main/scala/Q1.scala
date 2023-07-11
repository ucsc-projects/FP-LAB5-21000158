import scala.io.StdIn

object Q1 {
  def main(args:Array[String]): Unit = {
    print("Please input an integer: ")
    val inp = StdIn.readInt()
    println(prime(inp))
  }

  def GCD(a:Int,b:Int): Int = {
    b match{
      case 0 => a
      case x if(x>a)=> GCD(x,a)
      case x => GCD(x,a%x)
    }
  }

  def prime(a:Int,b:Int=2): Boolean = {
    b match {
      case x if(x==a)=>true
      case x if GCD(a,x)>1 => false
      case x => prime(a,x+1)
    }
  }

}
