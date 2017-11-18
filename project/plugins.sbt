// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.7")

val neoScalafmtVersion = "1.14"
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % neoScalafmtVersion)
addSbtPlugin("com.lucidchart" % "sbt-scalafmt-coursier" % neoScalafmtVersion)
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC12")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.2.0")