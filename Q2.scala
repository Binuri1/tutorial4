import scala.io.StdIn

object Q2 {

    def calculate (x: Int) : Unit= 

        x match{
           case x if (x <= 0)=> println("Zero or negetive")
      
        case x if(x % 2 == 0)=>println("Even number")
        
        case x if(x % 2 != 0)=>println("Odd number")
        
    }

    def main (args : Array [String]) : Unit = {
      val integer = StdIn.readInt()
      calculate(integer)
      
    }

}
