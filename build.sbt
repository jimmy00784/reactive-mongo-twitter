name := """reactive-mongo-twitter"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.webjars" %% "webjars-play" % "2.3.0",
  "org.webjars" % "knockout" % "3.1.0",
  "org.webjars" % "bootstrap" % "3.2.0",
  "org.webjars" % "jquery" % "2.1.1",
  "com.typesafe.akka" %% "akka-actor" % "2.3.3",
  "com.typesafe.akka" %% "akka-slf4j" % "2.3.3",
  "org.reactivemongo" %% "reactivemongo" % "0.11.0-SNAPSHOT",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.11.0-SNAPSHOT"
)

includeFilter in (Assets, LessKeys.less) := "*.less"
