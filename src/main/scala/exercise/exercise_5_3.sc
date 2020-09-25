// 3. Write a class Time with read-only properties hours and minutes and a method
//before(other: Time): Boolean that checks whether this time comes before the
//other. A Time object should be constructed as new Time(hrs, min), where hrs is in
//military time format (between 0 and 23).
class Time(private val hours: Int, private val minutes: Int) {
  def h = hours
  def m = minutes
  def before(other: Time) =  (h * 60 + m < other.h * 60 + other.m)
}
val time = new Time(1, 30)
println("Time is: " + time.h + ":" + time.m)
println(time.before(new Time(2, 30)))