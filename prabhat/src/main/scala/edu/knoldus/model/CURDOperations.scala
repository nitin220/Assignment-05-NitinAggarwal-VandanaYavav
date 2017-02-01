package edu.knoldus.model

case class Employee(id: Int, name: String, address: String, phno: Int, departmentId: Int, projectId: Int)

case class Department(id: Int, name: String)

case class Project(id: Int, departmentId: Int, name: String, clientId: Int)

case class Client(id: Int, projectId: Int, name: String, address: String)



