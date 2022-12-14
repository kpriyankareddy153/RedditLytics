name := """SOEN6441-ReditLytics-GoalDiggers"""
organization := "com.soen6441"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += "org.json" % "json" % "20210307"
