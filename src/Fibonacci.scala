

object Fibonacci {

  def main(args: Array[String]): Unit = {
    val stream = fibbonacciSequence()
    
    // Computes lazily
    println(stream(7))
    
    // Caches computed values
    println(stream(9))
    println(stream(3))
  }

  def fibbonacciSequence(): Stream[Int] = {
    def rule(a: Int, b: Int): Stream[Int] = {
      println(s"taking [$a, $b]")
      a #:: rule(b, a + b)
    }
    
    rule(0, 1)
  }

}