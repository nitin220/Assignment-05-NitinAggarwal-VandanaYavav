package edu.knoldus.daoimp

import java.sql.ResultSet

import edu.knoldus.dao.EmployeeTrait
import edu.knoldus.mySqlConnection.Connection
import edu.knoldus.model._


class EmployeeOperations extends EmployeeTrait {
  override def add(employee: Employee): Int = {
    val statement = Connection.connection.createStatement
    statement.executeUpdate(s"Insert into Employee values(${employee.id},'${employee.name}','${employee.address}',${employee.phno},${employee.departmentId},${employee.projectId})")
  }

  override def delete(employee: Employee): Int = {
    val statement = Connection.connection.createStatement
    statement.executeUpdate(s"delete from Employee where id=(${employee.id})")
  }

  override def read(employee: Employee): ResultSet = {
    val statement = Connection.connection.createStatement
    statement.executeQuery(s"select * from Employee where id=(${employee.id})")
  }

  override def update(employee: Employee): Int = ???

  override def getWithDepartmentId(id: Int): ResultSet = {
    val statement = Connection.connection.createStatement
    statement.executeQuery(s"select * from Employee where departmentId=(${id})")
  }

  override def getWithProjectId(id: Int): ResultSet = {
    val statement = Connection.connection.createStatement
    statement.executeQuery(s"select * from Employee where departmentId=(${id})")
  }
}


