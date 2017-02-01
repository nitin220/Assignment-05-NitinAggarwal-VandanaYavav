package edu.knoldus.daoimp

import java.sql.ResultSet

import edu.knoldus.dao._
import edu.knoldus.model.Project
import edu.knoldus.mySqlConnection.Connection

class ProjectOperations extends ProjectTrait {
  override def add(project: Project): Int = {
    val statement = Connection.connection.createStatement
    statement.executeUpdate(s"Insert into Project values(${project.id},'${project.departmentId}','${project.name}',${project.clientId})")
  }

  override def delete(project: Project): Int = {
    val statement = Connection.connection.createStatement
    statement.executeUpdate(s"delete from Project where id=(${project.id})")


  }

  override def update(project: Project): Int = ???

  override def read(project: Project): ResultSet = {
    val statement = Connection.connection.createStatement
    statement.executeQuery(s"select * from Project where id=(${project.id})")

  }
}
