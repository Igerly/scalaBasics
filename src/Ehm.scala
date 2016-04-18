

object Ehm extends App {

  println("A FUR TREE".christmasify())
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  implicit class WowFactor(str: String) {
    def christmasify() = {
      s"****${str}****"
    }
  }
}