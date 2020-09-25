import scala.collection.mutable.ArrayBuffer

object app{
  def main(args: Array[String]): Unit = {
    println(keepFirstNegative(ArrayBuffer(-1, 1, -2, 2, 3)).mkString(","))
  }

  def keepFirstNegative(array: ArrayBuffer[Int]) = {
    val index = array.indices.filter(array(_)<0).drop(1).reverse
    println(index.mkString(","))
    for(i <- index) array.remove(i)
    array
  }
//  def keepFirstNegative(array: ArrayBuffer[Int]) = {
//    val negativeIndex = new ArrayBuffer[Int]()
//    for(i <- array.indices){
//      if(array(i)<0) {
//        negativeIndex += i
//      }
//    }
//    val re = negativeIndex.reverse.dropRight(1)
//    for(j <- re){
//      array.remove(j)
//    }
//    array
//  }

}
app.main(null)