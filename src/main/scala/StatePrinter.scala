import models.NodeWithMarkState
import scala.io.AnsiColor
import models._

object StatePrinter extends AnsiColor {
  private val GREY = BLUE
  private val BACKGROUND_COLOUR = CYAN_B
  private val PAGE_HEIGHT = 24
  private val ROWCHARLIMIT = 16
  private val ROW_START_PADDING = 20
  private val SLEEP_MILLIS = 250
  private val BLANK_LINE = s"${BACKGROUND_COLOUR}\n"

  def drawPageFromNodesWithSleep(nodesWithMarkState: List[NodeWithMarkState]): Unit = {
    val sortedStates = nodesWithMarkState.sortBy(_.node.id).map(_.markState)
    println(padToOnePage(sortedStates.grouped(ROWCHARLIMIT).toList.map(createLine)))
    Thread.sleep(SLEEP_MILLIS)
  }

  def singleBlankPage = BLANK_LINE * PAGE_HEIGHT

  private def createLine(rowStates: List[MarkState]): String = {
    val topAndBottom = rowStates.map(s => getTopAndBottomChars(s)).mkString
    val middle = rowStates.map(s => getMiddleChars(s)).mkString
    val rowPadding = " " * ROW_START_PADDING
    List(rowPadding + topAndBottom, rowPadding + middle, rowPadding + topAndBottom).mkString("\n")
  }

  private def getTopAndBottomChars(state: MarkState) =
    state match {
      case Grey => s"${GREY}${BACKGROUND_COLOUR}${"  -  "}"
      case White => s"${WHITE}${BACKGROUND_COLOUR}${"  -  "}"
      case Black => s"${BLACK}${BACKGROUND_COLOUR}${"  -  "}"
    }

  private def getMiddleChars(state: MarkState) =
    state match {
      case Grey => s"${GREY}${BACKGROUND_COLOUR}${" |x| "}"
      case White => s"${WHITE}${BACKGROUND_COLOUR}${" |x| "}"
      case Black => s"${BLACK}${BACKGROUND_COLOUR}${" |x| "}"
    }

  def padToOnePage(printableState: List[String]): String = {
    val paddingHeight = (PAGE_HEIGHT - printableState.size).abs % PAGE_HEIGHT
    val paddedTop = BLANK_LINE * (paddingHeight / 2.0).floor.toInt
    val paddedBottom = BLANK_LINE * (paddingHeight / 2.0).ceil.toInt
    paddedTop + printableState.mkString("\n") + paddedBottom
  }
}
