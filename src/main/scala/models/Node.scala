package models
import models.MarkState

case class Node(linksTo: Set[Int], id: Int, inRootScope: Boolean) {
  def toWhiteNodeWithMarkState = NodeWithMarkState(this, White)
}

case class NodeWithMarkState(node: Node, markState: MarkState) {
  def updateMarkState(newState: MarkState) = this.copy(markState = newState)
}
