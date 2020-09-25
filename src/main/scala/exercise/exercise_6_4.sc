/*4. Define a Point class with a companion object so that you can construct Point
instances as Point(3, 4), without using new.*/
class Point(var num1: Int, var num2: Int) {}

object Point {
  def apply(num1: Int, num2: Int) =
    new Point(num1, num2)
}

val p = Point(1, 2)

assert(p.num1 == 1)


