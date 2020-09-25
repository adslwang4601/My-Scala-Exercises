/* 7. Write a class Person with a primary constructor that accepts a string containing
a first name, a space, and a last name, such as new Person("Fred Smith"). Supply
read-only properties firstName and lastName. Should the primary constructor
parameter be a var, a val, or a plain parameter? Why?*/

class Person(private val name: String) {
   val firstName = name.split("\\s+")(0)
   val lastName = name.split("\\s+")(1)
   override def toString = "Person(" + firstName + ", " + lastName + ")"
}

val John = new Person("John Paul")
println(John.firstName)
println(John)