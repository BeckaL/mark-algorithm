package models

sealed trait MarkState 
case object White extends MarkState
case object Grey extends MarkState
case object Black extends MarkState
