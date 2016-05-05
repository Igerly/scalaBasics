object Definitions extends App {

  val testVal: () => Int = {
    val r = util.Random.nextInt
    () => r
  }

  println(testVal())
  println(testVal())

  def testDef: () => Int = {
    val r = util.Random.nextInt
    () => r
  }

  println(testDef())
  println(testDef())
}