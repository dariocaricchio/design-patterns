import scala.collection.mutable.ListBuffer

trait Component[T] {
  def operation(): T
}

class Leaf (value: Int) extends Component[Int] {
  override def operation(): Int = this.value
}

class Composite extends Component[Int] {
  private val children = new ListBuffer[Component[Int]]()
  def +=(child: Component[Int]): Unit = children += child
  def -=(child: Component[Int]): Unit = children -= child
  override def operation(): Int = children.map(_.operation()).sum
}

object Composite {
  def main(args: Array[String]): Unit = {
    var root = new Composite()
    root += new Leaf(10)
    root += new Leaf(20)
    
    var child = new Composite()
    child += new Leaf(30)
    child += new Leaf(40)

    root += child
    
    println(root.operation())
  }
}