package scalaBasics.generics

object Generics extends App {
  
  val animalCage = new Cage(new Animal())
  
  val lionCage: Cage[Animal] = new Cage[Lion](new Lion())
  
  println(lionCage.letOut().getClass)
//  val testCage = new Cage(5)
}