/* 2. Extend the BankAccount class of the preceding exercise into a class SavingsAccount
that earns interest every month (when a method earnMonthlyInterest is called)
and has three free deposits or withdrawals every month. Reset the transaction
count in the earnMonthlyInterest method.*/
class BankAccount(initialBalance:Double) {
  private var _balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = {balance += amount; balance}
  def withdraw(amount: Double) = {balance -= amount; balance}
  def balance(): Double = _balance
}

class SavingsAccount(initialBalance: Double, interest_rate: Double) extends BankAccount(initialBalance) {
  var free_times: Int = 3

  def earnMonthlyInterest(): Double = {
    free_times = 3
    super.deposit(balance() * interest_rate / 12)
  }

  override def deposit(amount: Double): Double = {
    free_times -= 1
    super.deposit(amount-(if(free_times >=0) 0 else 1))
  }

  override def withdraw(amount: Double): Double = {
    free_times -= 1
    if(free_times >= 0) super.withdraw(amount) else super.withdraw(amount+1)
  }
}







