// 2. Write a class BankAccount with methods deposit and withdraw, and a read-only
//property balance.
class BankAccount(private var balance: Double=0.0) {
  def deposit(value: Double) = balance += value
  def withdraw(value: Double) = {
    if(balance>value) balance -= value
    else
      throw new Exception(f"Your balance $balance too small for withdraw $value")
  }
  def current = balance
}

val account = new BankAccount()
account.deposit(10)
account.withdraw(100)
println(account.current)