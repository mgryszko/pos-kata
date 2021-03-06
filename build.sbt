scalaVersion := "2.13.4"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.3.1",
  "org.typelevel" %% "cats-effect" % "2.3.1",
  "org.javamoney" % "moneta" % "1.4.2" pomOnly(),
  "org.scalatest" %% "scalatest" % "3.2.3" % "test"
)
