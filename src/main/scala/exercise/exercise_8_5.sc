/* 5. Design a class Point whose x and y coordinate values can be provided in a
constructor. Provide a subclass LabeledPoint whose constructor takes a label
value and x and y coordinates, such as*/
class Point(val x: Int, val y: Int) {
  override def toString = "Point(%d, %d)".format(x, y)
}


class LabelePoint(val label: String, x: Int, y: Int) extends Point(x, y) {
  override def toString = "Point(%s, %d, %d)".format(label, x, y)
}

val a = new Point(1, 2)
println(a)

val b = new LabelePoint(label = "Hi", x=1, y=2)
println(b)