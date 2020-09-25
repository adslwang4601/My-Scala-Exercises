/*1. Extend the following BankAccount class to a CheckingAccount class that charges $1
for every deposit and withdrawal.*/
class BankAccount(initialBalance:Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = {balance += amount; balance}
  def withdraw(amount: Double) = {balance -= amount; balance}
}


class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double): Double = super.deposit(amount-1)
  override def withdraw(amount: Double): Double = super.deposit(amount+1)
}


val ca = new CheckingAccount(100)
println(ca.deposit(10))