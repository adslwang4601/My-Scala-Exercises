// 6. In the Person class of Section 5.1, “Simple Classes and Parameterless Methods,”
//on page 55, provide a primary constructor that turns negative ages to 0.
class Person(private var privateAge: Int) {
  if(privateAge < 0) privateAge = 0
  def age = privateAge
  def age_=(newValue: Int){
    if (newValue > privateAge) privateAge = newValue
  }
}

