import sbt._
import sbt.Keys._

object KaratechopBuild extends Build {
  val scalaTest = "org.scalatest" %% "scalatest" % "1.6.1" % "test"
  lazy val dependencies = Seq(
    scalaTest
  )

  lazy val karatechop = Project(
    id = "karatechop",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "KarateChop",
      organization := "com.yutax77",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      // add other settings here
      libraryDependencies ++= dependencies
    )
  )
}
