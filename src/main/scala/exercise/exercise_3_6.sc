import scala.collection.mutable.ArrayBuffer

object app{
  def main(args: Array[String]): Unit = {
    println(reverseArr(Array(1, 2, 3)).mkString(","))
    println(reverseArrBuffer(ArrayBuffer(1, 2, 3)).mkString(","))
  }

  def reverseArr(array: Array[Int]) = {
    (for(i <- (array.indices).reverse) yield array(i)).toArray
  }

  def reverseArrBuffer(array: ArrayBuffer[Int]) = array.reverse
}

app.main(null)