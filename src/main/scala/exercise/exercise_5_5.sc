// 5. Make a class Student with read-write JavaBeans properties name (of type String)
//and id (of type Long). What methods are generated? (Use javap to check.) Can
//you call the JavaBeans getters and setters in Scala? Should you?
class Student(@scala.beans.BeanProperty var name: String, @scala.beans.BeanProperty var id: Long)
val s = new Student("qiang", 123)
/*
  Yes you can call getters and setters but you should not use them directly
  It's only necessary to get compatibility with Library that uses Bean
 */
assert(s.getId==s.id)
