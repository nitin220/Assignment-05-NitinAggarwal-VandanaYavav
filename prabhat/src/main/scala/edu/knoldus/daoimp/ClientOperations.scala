package edu.knoldus.daoimp

import java.sql.ResultSet

import edu.knoldus.dao._
import edu.knoldus.model.Client
import edu.knoldus.mySqlConnection.Connection

class ClientOperations extends ClientTrait {

  override def add(client: Client): Int

  = {
    val statement = Connection.connection.createStatement
    statement.executeUpdate(s"Insert into Client values(${client.id},'${client.projectId}','${client.name}','${client.address}')")
  }

  override def delete(client: Client): Int
  = {
    val statement = Connection.connection.createStatement
    statement.executeUpdate(s"delete from Client where id=(${client.id})")

  }

  override def update(client: Client): Int
  = ???

  override def read(client: Client): ResultSet
  = {
    val statement = Connection.connection.createStatement
    statement.executeQuery(s"select * from Client where id=(${client.id})")

  }

  override def getWithProjectId(id: Int): ResultSet
  = {
    val statement = Connection.connection.createStatement
    statement.executeQuery(s"select * from Client where id=(${id})")

  }

}
