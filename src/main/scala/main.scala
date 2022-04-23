object main {
  @main
  def getTicksAndPrintAnimationToTerminal(): Unit = {
    val stateHistory = MarkAlgorithm.getTicks(ExampleData.nodes)
    println(StatePrinter.singleBlankPage)
    stateHistory.foreach(StatePrinter.drawPageFromNodesWithSleep)
    Thread.sleep(1000)
  }
}
