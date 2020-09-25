// 4. Reimplement the Time class from the preceding exercise so that the internal
//representation is the number of minutes since midnight (between 0 and 24 ×
//60 – 1). Do not change the public interface. That is, client code should be
//unaffected by your change.
class Time(private val hours: Int, private val minutes: Int) {

  private val mins = hours * 60 + m
  def h = hours
  def m = minutes
  def before(other: Time) =  mins < other.mins
}
val time = new Time(1, 30)
println("Time is: " + time.h + ":" + time.m)
println(time.before(new Time(2, 30)))