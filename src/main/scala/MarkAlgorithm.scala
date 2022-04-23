import models.{Black, Node, NodeWithMarkState, White, Grey}

object MarkAlgorithm {
  def getTicks(nodes: List[Node]): List[List[NodeWithMarkState]] = {
    val initialNodes = nodes.map(_.toNodeWithWhiteMarkState)
    val nodesWithRootsGreyed = setRootScopeNodesAsGrey(initialNodes)

    def go(nodesWithState: List[NodeWithMarkState], previousStates: List[List[NodeWithMarkState]]): List[List[NodeWithMarkState]] =
      nodesWithState.find(n => n.markState == Grey) match {
        case Some(greyNode: NodeWithMarkState) =>
          val newNodesWithState = nodesWithState.map {
            case node if nodeIsWhiteNeighbour(node, greyNode) => node.updateMarkState(Grey)
            case n if n == greyNode => n.updateMarkState(Black)
            case otherNode => otherNode
          }
          go(newNodesWithState, previousStates :+ newNodesWithState)
        case None => previousStates
      }

    go(nodesWithRootsGreyed, List(initialNodes, nodesWithRootsGreyed))
  }

  private def nodeIsWhiteNeighbour(nodeToCheck: NodeWithMarkState, greyNode: NodeWithMarkState) =
    greyNode.node.linksTo.contains(nodeToCheck.node.id) && nodeToCheck.markState == White

  private def setRootScopeNodesAsGrey(nodesWithMarkState: List[NodeWithMarkState]): List[NodeWithMarkState] =
    nodesWithMarkState.map { n => if (n.node.inRootScope) n.updateMarkState(Grey) else n }
}
