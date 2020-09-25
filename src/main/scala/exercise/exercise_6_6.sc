//6. Write an enumeration describing the four playing card suits so that the toString
//  method returns ß, ®, ©, or ™.

object CardSuit extends Enumeration {
  type CardSuit = Value
  val spades = Value("\u2660")
  val diamonds = Value("\u2666")
  val hearts = Value("\u2665")
  val clubs = Value("\u2663")
}

println(CardSuit.spades)

