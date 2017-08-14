lazy val root = (project in file(".")).
  dependsOn(latis).
  settings(
    name := "$name;format="normalized"$",
    scalaVersion := "2.11.8",
    webappWebInfClasses := true,
    containerArgs := Seq("--path", "/$name;format="normalized"$")
  )
enablePlugins(JettyPlugin)

lazy val latis = ProjectRef(file("../latis"), "latis")
