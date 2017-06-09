package com.messhall.dao

import java.sql.{Connection, DriverManager}
import java.io.{File, FileInputStream, InputStream}
import org.yaml.snakeyaml.Yaml
import scala.collection.JavaConverters._

object Connector {

    val inFile: InputStream = new FileInputStream (new File ("etc/mysql_login"))
    val yaml: Yaml = new Yaml
    // tfw java: Convert java.util.Map -> scala.collection.mutable.Map
    val configData = yaml.load(inFile).asInstanceOf[java.util.Map[String, String]].asScala

    val url = configData.getOrElse("url", "jdbc:mysql://localhost:3305")
    val dbName = configData.getOrElse("dbName", "no_name")
    val driver = configData.getOrElse("driver", "com.mysql.jdbc.Driver")
    val username = configData.getOrElse("username", "user") // NEVER DEFAULT TO ROOT
    val password = configData.getOrElse("password", "hunter3")


    try {
        Class.forName(driver)
        val connection: Connection = DriverManager.getConnection(url, username, password)
    } catch {
        case e: Exception => e.printStackTrace
    }
}
