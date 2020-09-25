object app {
  def main(args: Array[String]): Unit = {
    println(java.util.TimeZone.getAvailableIDs
      .map(_.stripPrefix("America/").trim)
      .mkString(","))
  }
}

app.main(null)