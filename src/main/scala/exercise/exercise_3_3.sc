object App {
  def main(args: Array[String]): Unit = {
    swapElement(Array(1, 2, 3)).foreach(println)
  }

  def swapElement(a: Array[Int]):Array[Int] = {
    (for(i <- a.indices) yield
      if (i%2==0 && (i+1)==a.length) a(i) //last element for odd length
      else if (i%2==0) a(i+1)
      else a(i-1)
      ).toArray
  }
}

App.main(null)




