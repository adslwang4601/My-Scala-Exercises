import scala.collection.mutable.ArrayBuffer

object app{
  def main(args: Array[String]): Unit = {
    println(keepFirstNegative(ArrayBuffer(-1, -2, -3, -4, 2)).mkString(","))
  }

  def keepFirstNegative(array: ArrayBuffer[Int]) = {
    val negatives = array
      .indices
      .filter(array(_)<0)
      .drop(1)
      .reverse
    val target = array
      .indices
      .filter(!negatives.contains(_))
      .drop(1)
      .takeRight(negatives.length)
    println(target.mkString(","))
    for (from <- negatives; to <- target) {
      val tmp = array(to)
      array(to) = array(from)
      array(from) = tmp
    }
    array.dropRight(negatives.length)
  }

}
app.main(null)