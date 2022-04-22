object main {
  @main
  def getTicksAndPrintAnimationToTerminal(): Unit = {
    val nodes = ExampleData.nodes
    val stateHistory = MarkAlgorithm.getTicks(nodes)
    println("size")
    println(stateHistory.size)

    println(StatePrinter.singleBlankPage)
    stateHistory.foreach(StatePrinter.drawPageFromNodesWithSleep)
    Thread.sleep(1000)
  }
}
