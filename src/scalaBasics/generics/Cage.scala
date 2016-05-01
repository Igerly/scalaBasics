package scalaBasics.generics

class Cage[+T <: Animal](denizen: T) {

//  Won't work - can break type-safety   
//  def imprison(animal: T) = {
//    // whatever
//  }
  
  def letOut(): T = 
    denizen
  
}
