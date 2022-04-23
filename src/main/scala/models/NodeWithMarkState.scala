package models

case class NodeWithMarkState(node: Node, markState: MarkState) {
  def updateMarkState(newState: MarkState) = this.copy(markState = newState)
}
