object App {
  def main(args: Array[String]): Unit = {
    swapElement(Array(1, 2, 3)).foreach(println)
  }

  def swapElement(l: Array[Int]): Array[Int] = {
    for(i <- 0 until l.length-1 by 2){
      val temp = l(i)
      l(i)  = l(i+1)
      l(i+1) = temp
    }
    l
  }
}

App.main(null)




