object TuplesExamples {
  
  def showcase = {
    // Basics
    val idUsername = (0, "randomusername")
    println("Id is: " + idUsername._1) //Prints "Id is: 0".
    println("Username is: " + idUsername._2) //Prints "Username is: randomusername".
    
    // Binding
    val (id, username) = (0, "randomusername")
    println("Id is: " + id) //Prints "Id is: 0".
    println("Username is: " + username) //Prints "Username is: randomusername".
    
    // multi-value return
    val numbers = List(1, 2, 30, 45, 13)
    val (sum, average) = getSumAverage(numbers)
    println("Sum, average is: " + sum + ", " + average)
  }

  def getSumAverage(numbers: List[Int]) = {
    val sum = numbers.sum
    val average = (sum: Double) / numbers.length
    (sum, average)
  }
}