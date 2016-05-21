name := "KataBankOCR"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies ++= {
  val scalaTestV = "2.2.5"
  Seq(
    "org.scalatest" %% "scalatest" % scalaTestV % "test"
  )
}