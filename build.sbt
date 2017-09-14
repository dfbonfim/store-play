name := "StorePlay"

version := "1.0"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "net.sf.barcode4j" % "barcode4j" % "2.0"
)

play.Project.playScalaSettings
