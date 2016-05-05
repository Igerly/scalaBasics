

object Functions extends App {

  // Higher-order function
  def filter(list: List[Int], test: Int => Boolean): List[Int] = {
    // Nested function
    def process(ys: List[Int]): List[Int] = {
      if (ys.isEmpty) ys
      else if (test(ys.head)) ys.head :: process(ys.tail)
      else process(ys.tail)
    }

    process(list)
  }
  
  val srcList = List(1, 2, 3, 4, 5, 6)
  
  // Anonymous function
  println(filter(srcList, (x) => x % 2 == 0))
  
  // Method as a function + curried / partially-applied fn
  def divides(n:Int)(x: Int): Boolean =
    x % n == 0
  
  // curried / partially-applied fn
  println(filter(srcList, divides(3)))
  
  // Every function is actually a child of FunctionN class
  class StrFunction extends Function1[String, Int] {

    // A neat way to state a method is not implemented yet
    def apply(v1: String): Int = ???
      
  }
  
  // Methods <-> Functions
  def shout( word: String ) = println(word + "!")
  
  val shout1 = shout _
  
  val shout2 = new Function1[String, Unit] {
    def apply(word: String) = println(word + "!")
  } 
  
  val shout3 = (word:String) => println(word + "!")  
  
  shout("hey _")
  shout1("hey 1")
  shout2("hey 2")
  shout3("hey 3")  
  
//  shout.apply("hey") compiler error - it's a method
  shout1.apply("hey") 
  shout2.apply("hey") 
  shout3.apply("hey") 
  
  
  // filter function redefined with Pattern Matching
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