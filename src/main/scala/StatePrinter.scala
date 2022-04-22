import models.NodeWithMarkState
import scala.io.AnsiColor
import models._

object StatePrinter extends AnsiColor {
  val GREY = BLUE
  val BACKGROUND_COLOUR = CYAN_B
  val PAGE_HEIGHT = 24
  val ROWCHARLIMIT = 16

  private def getTopAndBottomChars(state: MarkState) = {
    val topAndBottom = "  -  "
    state match {
      case Grey => s"${GREY}${BACKGROUND_COLOUR}${topAndBottom}"
      case White => s"${WHITE}${BACKGROUND_COLOUR}${topAndBottom}"
      case Black => s"${BLACK}${BACKGROUND_COLOUR}${topAndBottom}"
    }
  }

  val blank_line = s"${BACKGROUND_COLOUR}\n"

  private def getMiddleChars(state: MarkState) = {
    val middle = " |x| "

    state match {
      case Grey => s"${GREY}${BACKGROUND_COLOUR}${middle}"
      case White => s"${WHITE}${BACKGROUND_COLOUR}${middle}"
      case Black => s"${BLACK}${BACKGROUND_COLOUR}${middle}"
    }
  }

  def padToOnePage(printableState: List[String]): String = {
    val paddingHeight = (PAGE_HEIGHT - printableState.size).abs % PAGE_HEIGHT
    val paddedTop = blank_line * ((paddingHeight / 2.0).floor.toInt)
    val paddedBottom = blank_line * ((paddingHeight / 2.0).ceil.toInt)
    paddedTop + printableState.mkString("\n") + paddedBottom
  }

  def singleBlankPage =
    blank_line * PAGE_HEIGHT

  private def createLine(rowStates: List[MarkState]): String = {
    val topAndBottom = rowStates.map(s => getTopAndBottomChars(s)).mkString
    val middle = rowStates.map(s => getMiddleChars(s)).mkString
    List(" " * 20 + topAndBottom, " " * 20 + middle, " " * 20 + topAndBottom).mkString("\n")
  }

  def drawStateOnPageWithSleep(states: List[MarkState]) = {
    println(padToOnePage(states.grouped(ROWCHARLIMIT).toList.map(createLine)))
    Thread.sleep(250)
  }

  def drawPageFromNodesWithSleep(nodesWithMarkState: List[NodeWithMarkState]): Unit =
    drawStateOnPageWithSleep(sortNodesWithStateAndGetIds(nodesWithMarkState))

  private def sortNodesWithStateAndGetIds(nodesWithMarkState: List[NodeWithMarkState]): List[MarkState] =
    nodesWithMarkState.sortBy(_.node.id).map(_.markState)

  def test = {
    println(drawStateOnPageWithSleep(List(Black, White, Black, Grey, Black, Black, White, Grey, Grey)))
  }
}
