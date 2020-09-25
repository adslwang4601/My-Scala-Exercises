import java.awt.datatransfer._

object app {
  def main(args: Array[String]): Unit = {
    ex11()
  }

  def ex11() = {
    import scala.jdk.CollectionConverters._
    import scala.collection.mutable.Buffer
    import java.awt.datatransfer._
    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    flavors.getNativesForFlavor(DataFlavor.imageFlavor).asScala
  }
}

app.main(null)