object Chapter04 {

  // 01 Set up a map of prices for a number of gizmos that you covet. Then produce
  //a second map with the same keys and the prices at a 10 percent discount.
  def priceMap() = {
    val originalMap = Map("Basketball" -> 10, "football" -> 20)
    for((k, v) <- originalMap) yield (k, v*0.9)
  }

  // 02 Write a program that reads words from a file. Use a mutable map to count
  //how often each word appears. To read the words, simply use a java.util.Scanner:
  import scala.io.Source
  def countWords() = {
    val source = Source.fromResource("unit4/ex4words.txt")
    val tokens = source.getLines().mkString(" ").split("\\s+")
    source.close()

    val countMap = scala.collection.mutable.Map[String, Int]()
    for(key <- tokens) countMap(key) = countMap.getOrElse(key, 0) + 1
    countMap
  }

  // 03 Repeat the preceding exercise with an immutable map.
  import scala.collection.immutable.HashMap
  def countWords_2() = {
    val source = Source.fromResource("myfile.txt")
    val tokens = source.getLines().mkString(" ").split("\\s+")
    source.close()

    var countMap = HashMap[String, Int]()
    for(key <- tokens) countMap+=(key -> (countMap.getOrElse(key, 0)+1))
    countMap
  }

  // 04 Repeat the preceding exercise with a sorted map, so that the words are
  //printed in sorted order.
  import scala.collection.SortedMap
  def countWords_3() = {
    val source = Source.fromResource("myfile.txt")
    val tokens = source.getLines().mkString(" ").split("\\s+")
    source.close()

    var countMap = SortedMap[String, Int]()
    for(key <- tokens) countMap+=(key -> (countMap.getOrElse(key, 0)+1))
    countMap
  }

  // 05 Repeat the preceding exercise with a java.util.TreeMap that you adapt to the
  //Scala API.
  import scala.collection.convert
  def countWords_4() = {
    val source = Source.fromResource("myfile.txt")
    val tokens = source.getLines().mkString(" ").split("\\s+")
    source.close()

    var countMap = new java.util.TreeMap[String, Int]()
    for(key <- tokens) countMap.put(key, (countMap.getOrDefault(key, 0)+1))
    countMap
  }


  // 06 Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and
  //similarly for the other weekdays. Demonstrate that the elements are visited
  //in insertion order.
  def weekday() = {
    val map = scala.collection.mutable.LinkedHashMap(
      "Monday" -> java.util.Calendar.MONDAY,
      "TUESDAY" -> java.util.Calendar.TUESDAY,
      "WEDNESDAY" -> java.util.Calendar.WEDNESDAY,
      "THURSDAY" -> java.util.Calendar.THURSDAY,
      "FRIDAY" -> java.util.Calendar.FRIDAY,
      "SATURDAY" -> java.util.Calendar.SATURDAY,
      "SUNDAY" -> java.util.Calendar.SUNDAY
    )
    map
  }

  // 07 Print a table of all Java properties reported by the getProperties method of the
  //java.lang.System class, like this:
  import scala.jdk.javaapi.CollectionConverters._
  def javaInfo() = {
    val props: scala.collection.Map[String, String] = asScala(java.lang.System.getProperties)
    val maxLength = props.keys.maxBy(_.length).length
    for((k,v) <- props) println(k + ' ' * (maxLength-k.length) + '|' + v)
  }

  //08 Write a function minmax(values: Array[Int]) that returns a pair containing the
  //smallest and the largest values in the array.
  def getMaxMin(values: Array[Int]) = (values.min, values.max)

  //09 Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing
  //the counts of values less than v, equal to v, and greater than v.
  def lteqgt(values: Array[Int], v: Int) = (values.count(_<v), values.count(_==v), values.count(_>v))

  //10 What happens when you zip together two strings, such as "Hello".zip("World")?
  //Come up with a plausible use case.
  def zipString(s1:String, s2:String) = {
    //use case => find difference between two strings
    val diff = "Hello world !".zip("hello world!").filter(t => t._1!=t._2)
    assert( diff == IndexedSeq(('H','h'), (' ','!')) )
  }
}



Chapter04.zipString("Hello", "world")