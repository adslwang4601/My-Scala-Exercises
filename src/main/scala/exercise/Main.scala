object Exercise_7_9 extends App{
  import java.lang.System
  var password = io.StdIn.readLine()
  val userName = System.getProperty("user.name")

  if(password == "secret") println(f"Hello, $userName")
  else println("Password is wrong")
}