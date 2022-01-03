name := "MyWorkBook"

version := "0.1"

scalaVersion := "2.13.5"
val circeVersion = "0.12.3"
val akkaVersion = "2.6.1"
val akkaHttpVersion = "10.1.11"
val akkaHttpCirceVersion = "1.30.0"
val scalaTestVersion = "3.1.0"
libraryDependencies += "org.typelevel" %% "cats-core" % "2.6.1"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"


//json library: https://circe.github.io/circe/
libraryDependencies += "io.circe" %% "circe-core" % circeVersion
libraryDependencies += "io.circe" %% "circe-generic" % circeVersion
libraryDependencies += "io.circe" %% "circe-parser" % circeVersion
libraryDependencies += "de.heikoseeberger" %% "akka-http-circe" % akkaHttpCirceVersion
