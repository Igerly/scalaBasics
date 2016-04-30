

object Fibonacci {

  def main(args: Array[String]): Unit = {
    val stream = fibbonacciSequence()
    println(stream(7))
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