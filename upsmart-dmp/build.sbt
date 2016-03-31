import sbt.Keys._

//import com.typesafe.sbt.less.Import.LessKeys._

name := """upsamrt-dmp"""

version := "0.0.1"

scalaVersion := "2.10.4"

//herokuAppName in Compile := "voter"

lazy val root = (project in file("."))
    .enablePlugins(PlayScala)
    .enablePlugins(SbtTwirl)

// LessKeys.compress in Assets := true

//LessKeys.verbose in Assets := true

// resolvers ++= Seq(
//   "Nexus Snapshots" at "http://192.168.0.105:8081/nexus/content/groups/public/",
//   "Nexus Thirdparty" at "http://192.168.0.105:8081/nexus/content/repositories/thirdparty/",
//   "jahia org repository" at "http://maven.jahia.org/maven2/",
//   Resolver.sonatypeRepo("snapshots")
// )

// disable doc generation
doc in Compile <<= target.map(_ / "none")


// do not package conf/* into the binary
//mappings in (Compile, packageBin) ~= { _.filterNot { case (_, name) =>
//  Seq("application.conf", "akka.conf").contains(name)
//}}

libraryDependencies ++= {
  val akkaVersion = "2.3.3"
  Seq(
    anorm,
    cache,
    ws,
    "org.json4s"                  %% "json4s-native"                    % "3.2.8",
    "org.json4s"                  %% "json4s-ext"                       % "3.2.8"
    //"com.github.tototoshi"        %% "play-json4s-native"               % "0.2.0"
  )
}

libraryDependencies += filters
