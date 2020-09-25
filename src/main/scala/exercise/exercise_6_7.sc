/*7. Implement a function that checks whether a card suit value from the preceding
  exercise is red.*/

object CardSuit extends Enumeration {
  type CardSuit = Value
  val spades = Value("\u2660")
  val diamonds = Value("\u2666")
  val hearts = Value("\u2665")
  val clubs = Value("\u2663")

  def checkRed(card: Value) = {
    if(card==diamonds||card==hearts) "This is a red color"
    else "This is not a red color"
  }
}



CardSuit.checkRed(CardSuit.diamonds)