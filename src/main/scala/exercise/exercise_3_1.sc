// 1
import scala.util.Random

object App{
  def main(args: Array[String]): Unit = {
    nRandomArray(10).foreach(println)
  }

  def nRandomArray(n: Int): Array[Int] = {
//    val a = new Array[Int](n)
//    val r = new Random()
//    for(i <- a) yield r.nextInt(n)

    new Array[Int](n).map(_=>Random.nextInt(n))
  }


}

App.main(null)


