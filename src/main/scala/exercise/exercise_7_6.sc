/*6. Write a program that copies all elements from a Java hash map into a Scala
  hash map. Use imports to rename both classes.*/
import java.util.{HashMap => JavaHashMap}

import scala.collection.mutable

val javaMap = new JavaHashMap[String, String]()
javaMap.put("1", "Good")
javaMap.put("2", "Bad")
val scalaMap = new mutable.HashMap[String, String]()
for(k<- javaMap.keySet().toArray()) {
  scalaMap += (k.toString -> javaMap.get(k))
}

println(scalaMap)
