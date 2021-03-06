

object TraitsExample extends App {
  
  trait Swimming {
    // state in an interface?!
    val avgSpeed = 10
    
    def swim(): Unit = {
      println(s"I swim with an average speed of $avgSpeed")
    }
  }
  
  trait Yelling {
    def yell(s: String) = {
      println(s"YELLING: $s")
    }
  }
  
  class Swimmer extends Swimming {}
  
  class SpeedoSwimmer extends Swimming {
    // ouch, I just overrode state...
    override val avgSpeed = 20 
  }
  
  val swimmer = new Swimmer()
  swimmer.swim()
  
  val speeder = new SpeedoSwimmer()
  speeder.swim();
  
  val loudSwimmer = new Swimmer() with Yelling
  
  loudSwimmer.yell("Yahoo!")
}