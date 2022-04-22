ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.2"

libraryDependencies += "org.jline" % "jline-terminal" % "3.19.0"

lazy val root = (project in file("."))
  .settings(
    name := "mark-algorithm"
  )
