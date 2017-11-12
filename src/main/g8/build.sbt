
name := "sbt-idlc"

version := $version$

scalaVersion := $scalaVersion$

sbtPlugin := true

organization := "$organization$"

resolvers += Resolver.mavenLocal

lazy val commonSettings = Seq(
  organization := "$organization$",
  version := $version$,
  scalaVersion := $scalaVersion$
)

lazy val $name$_api = (project in file("$name$-api"))
  .settings(
    commonSettings,
    name := "$name$-api",
    libraryDependencies ++= Seq(
      "com.isuwang" % "dapeng-remoting-api" % "1.2.1",
      "com.isuwang" % "dapeng-remoting-netty" % "1.2.1",
      "com.isuwang" % "common-library" % "1.2.1"
    )
  ).enablePlugins(ThriftGeneratorPlugin)


lazy val $name$_service = (project in file("$name$-service"))
  .dependsOn( $name$_api )
  .settings(
    commonSettings,
    name := "$name$_service",
    libraryDependencies ++= Seq(
      "com.isuwang" % "dapeng-spring" % "1.2.1",
      "com.github.wangzaixiang" %% "scala-sql" % "2.0.0",
      "org.slf4j" % "slf4j-api" % "1.7.13",
      "ch.qos.logback" % "logback-classic" % "1.1.3",
      "ch.qos.logback" % "logback-core" % "1.1.3",
      "mysql" % "mysql-connector-java" % "5.1.36",
      "com.alibaba" % "druid" % "1.0.17",
      "org.springframework" % "spring-context" % "4.2.4.RELEASE"
    )).enablePlugins(ImageGeneratorPlugin)