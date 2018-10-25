package demo

fun getName(i:Int) : String{
  val t = Greeter().getGreeting()
  return "$t tom $i"
}
