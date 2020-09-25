/*6. In the preceding exercise, move all imports into the innermost scope possible.*/
import java.util.{HashMap => JavaHashMap}
val javaMap = new JavaHashMap[String, String]()
javaMap.put("1", "Good")
javaMap.put("2", "Bad")
import scala.collection.mutable
val scalaMap = new mutable.HashMap[String, String]()
for(k<- javaMap.keySet().toArray()) {
  scalaMap += (k.toString -> javaMap.get(k))
}

println(scalaMap)
