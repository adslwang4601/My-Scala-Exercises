object app{
  def main(args: Array[String]): Unit = {
    println(sortArray(Array(1, -2, 3, -5, 6)).mkString(","))
  }

  def sortArray(a: Array[Int]) = a.filter(_>=0) ++ a.filter(_<0)

//  def sortArray(a: Array[Int]): Array[Int] = {
//    for(i <- a.indices) {
//      if(a(i)>0) {
//        var j = i
//        while(j>0&&a(j-1)<0) {
//          val temp = a(j)
//          a(j) = a(j-1)
//          a(j-1) = temp
//          j -= 1
//        }
//      }
//    }
//    a
//  }
}

app.main(null)
