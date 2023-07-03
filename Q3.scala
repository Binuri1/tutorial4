object Q3 {
  def toUpper(str:String): String = str.toUpperCase

  def toLower(str:String) : String = str.toLowerCase

  def toUpper(str:String, i:Int):String={
    var s = new StringBuilder(str)
    var c = toUpper(str.charAt(i).toString)
    s.deleteCharAt(i)
    s.insert(i, c).toString()
  }

  def formatNames(name:String, f:String=>String):String = f(name)

  def formatNames(name:String, f:(String,Int)=>String, index:Int):String= f(name, index)

  def main(args: Array[String]): Unit = {
    var arr:Array[String] =  Array ("Benny", "Niroshan", "Saman" ,"Kumara" )
    println(formatNames(arr(0), toUpper))
    println(formatNames(arr(1), toUpper, 1))
    println(formatNames(arr(2), toLower))
    println(formatNames(arr(3), toUpper, arr(3).length-1))

  }
}