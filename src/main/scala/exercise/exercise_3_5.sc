object app {
  def main(args: Array[String]): Unit = {
    println(avgArr(Array(1, 9, 3, -5, 6)))
  }

  def avgArr(a: Array[Int]) = a.sum / a.length

}

app.main(null)