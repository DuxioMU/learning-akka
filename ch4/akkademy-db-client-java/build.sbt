name := """akkademy-db-client-java"""

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  // Uncomment to use Akka
  //"com.typesafe.akka" % "akka-actor_2.11" % "2.3.9",
  "com.akkademy-db"   %% "akkademy-db-java"     % "0.1.0-SNAPSHOT",
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.6.0-SNAPSHOT",
  "junit"             % "junit"           % "4.12"  % "test",
  "com.novocode"      % "junit-interface" % "0.11"  % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.6" % "test"
)
