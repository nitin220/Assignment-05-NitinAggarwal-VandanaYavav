package edu.knoldus.daoimp

import java.sql.ResultSet

import edu.knoldus.dao._
import edu.knoldus.model.Department
import edu.knoldus.mySqlConnection.Connection

class DepartmentOperations extends DepartmentTrait {
  override def add(department: Department): Int = {
    val statement = Connection.connection.createStatement
    statement.executeUpdate(s"Insert into Department values(${department.id},'${department.name}')")
  }

  override def delete(department: Department): Int = {
    val statement = Connection.connection.createStatement
    statement.executeUpdate(s"delete from Department where id=(${department.id})")

  }

  override def update(department: Department): Int = ???

  override def read(department: Department): ResultSet = {
    val statement = Connection.connection.createStatement
    statement.executeQuery(s"select * from Department where id=(${department.id})")

  }

}
