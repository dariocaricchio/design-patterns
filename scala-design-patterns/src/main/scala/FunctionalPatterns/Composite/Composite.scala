import scala.collection.mutable.ListBuffer

class Node (value: Int) {
    val children = new ListBuffer[Node]()
    def +=(child: Node): Unit = children += child
    def -=(child: Node): Unit = children -= child
    def operation(): Int = this.value
}

def sum_of_paths(tree: Node): Int = {
    if (tree.children.isEmpty)
        return tree.operation()
    return tree.operation() + tree.children.map(sum_of_paths(_)).sum
}

object CompositeFunc {
    def main(args: Array[String]): Unit = {
        var root = Node(10)
        root += Node(20)
        var subtree = Node(30)
        subtree += Node(10)
        root += subtree

        println(sum_of_paths(root))
    }
}
