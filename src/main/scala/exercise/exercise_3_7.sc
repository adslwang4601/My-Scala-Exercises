object app{
  def main(args: Array[String]): Unit = {
    println(Array(1, 1, 2, 2, 3).distinct.mkString(","))
  }
}

app.main(null)