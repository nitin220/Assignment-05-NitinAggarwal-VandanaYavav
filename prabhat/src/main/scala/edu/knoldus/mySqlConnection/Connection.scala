package edu.knoldus.mySqlConnection

import java.sql.DriverManager

object Connection {
  val driver = "com.mysql.jdbc.Driver"
  val url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6156522"
  val userName = "sql6156522"
  val password = "AhfmGWGEgF"

  Class.forName(driver)
  val connection = DriverManager.getConnection(url, userName, password)
}
