package classes

object PersonExample extends App {

  def pokePerson() = {
    val p: Person = new Person("Vasja", "Pupkin", 23)
    p.age = 43
  }
  
  // .apply() in action
  val casePerson: CasePerson = CasePerson("Petja", "Vasechkin", 12)
  
  // From a tuple (actually, same .apply() in action)
  val tupled = CasePerson.tupled( ("Petja", "Vasechkin", 12) )
  
  val vasjas = CasePerson.curried("Vasja")
  
  val petechkin = vasjas("Petechkin")(10)
  val ivanov = vasjas("Ivanov")(17)
  
}