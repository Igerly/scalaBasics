

object Functions extends App {

  def filter(list: List[Int], test: Int => Boolean): List[Int] = {
    def process(ys: List[Int]): List[Int] = {
      if (ys.isEmpty) ys
      else if (test(ys.head)) ys.head :: process(ys.tail)
      else process(ys.tail)
    }

    process(list)
  }
  
  val srcList = List(1, 2, 3, 4, 5, 6)
  
  println(filter(srcList, (x) => x % 2 == 0))
  
  def divides(n:Int)(x: Int): Boolean =
    x % n == 0
  
  println(filter(srcList, divides(3)))
  
  class StrFunction extends Function1[String, String] {

    def apply(v1: String): String = ???
      
  }
  
  
  
  
  
  
  
  
  
  
  def patternedFilter(list: List[Int], test: Int => Boolean): List[Int] = {
    def process(ys: List[Int]): List[Int] = ys match { 
      case Nil => 
        ys
      case x::xs => 
        if (test(x)) 
          x :: process(xs.tail) 
        else 
          process(xs.tail)
    }
    
    process(list)
  }
}