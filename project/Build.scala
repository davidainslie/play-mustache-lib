import _root_.play.sbt.PlayScala
import play.sbt.PlayImport._
import sbt.Keys._
import sbt._

object Build extends Build {
  val moduleName = "play-mustache-lib"

  val root = Project(id = moduleName, base = file(".")).enablePlugins(PlayScala)
    .configs(IntegrationTest)
    .settings(Defaults.itSettings: _*)
    .settings(
      name := moduleName,
      organization := "kissthinker",
      version := "1.0.0-SNAPSHOT",
      scalaVersion := "2.11.7",
      scalacOptions ++= Seq(
        "-feature",
        "-language:implicitConversions",
        "-language:higherKinds",
        "-language:existentials",
        "-language:reflectiveCalls",
        "-language:postfixOps",
        "-Yrangepos",
        "-Yrepl-sync"),
      resolvers ++= Seq(
        "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
        "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
        "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
        "Kamon Repository" at "http://repo.kamon.io"
      )
    )
    .settings(libraryDependencies ++= {
      Seq(
        jdbc,
        cache,
        ws,
        specs2 % Test,
        "org.webjars" %% "webjars-play" % "2.4.0-1",
        "org.webjars" % "bootstrap" % "4.0.0-alpha.2",
        "org.webjars" % "jquery" % "3.0.0-alpha1",
        "org.webjars" % "mustachejs" % "2.2.1"
      ) ++ Seq(
        specs2 % Test
      )
    })
}