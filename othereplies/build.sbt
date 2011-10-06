name := "othereplies"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases" 

resolvers += "repo.codahale.com" at "http://repo.codahale.com" 

libraryDependencies ++= Seq(
    "se.scalablesolutions.akka" % "akka-actor" % "1.2",
    "se.scalablesolutions.akka" % "akka-remote" % "1.2",
    "se.scalablesolutions.akka" % "akka-slf4j" % "1.2",
    "org.slf4j" % "slf4j-log4j12" % "1.6.0",
    "org.slf4j" % "slf4j-api" % "1.6.0",
    "com.ning" % "async-http-client" % "1.6.4",
    "org.codehaus.jackson" % "jackson-core-asl" % "1.8.3",
    "org.codehaus.jackson" % "jackson-mapper-asl" % "1.8.3",
    "com.codahale" % "jerkson_2.9.0-1" % "0.4.0",
    "com.yammer.metrics" % "metrics-core" % "2.0.0-BETA17-SNAPSHOT",
    "com.yammer.metrics" % "metrics-scala_2.9.0-1" % "2.0.0-BETA17-SNAPSHOT",
    "redis.clients" % "jedis" % "2.0.0",
    "org.scala-tools.time" % "time_2.9.0-1" % "0.5",
    "org.scalatra" %% "scalatra" % "2.0.0.RC1",
    "org.scalatra" %% "scalatra-scalate" % "2.0.0.RC1"
)

scalaVersion := "2.9.0-1"

scalacOptions ++= Seq("-unchecked", "-deprecation")

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)
