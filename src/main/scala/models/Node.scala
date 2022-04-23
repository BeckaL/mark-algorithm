package models

case class Node(linksTo: Set[Int], id: Int, inRootScope: Boolean) {
  def toNodeWithWhiteMarkState = NodeWithMarkState(this, White)
}


