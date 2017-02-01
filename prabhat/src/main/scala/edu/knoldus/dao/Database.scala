package edu.knoldus.dao

import java.sql.ResultSet

import edu.knoldus.model._


trait EmployeeTrait {
  def add(employee: Employee): Int

  def delete(employee: Employee): Int

  def update(employee: Employee): Int

  def read(employee: Employee): ResultSet

  def getWithDepartmentId(id: Int): ResultSet

  def getWithProjectId(id: Int): ResultSet
}

trait ClientTrait {
  def add(client: Client): Int

  def delete(client: Client): Int

  def update(client: Client): Int

  def read(client: Client): ResultSet

  def getWithProjectId(id:Int): ResultSet
}

trait DepartmentTrait {
  def add(department: Department): Int

  def delete(department: Department): Int

  def update(department: Department): Int

  def read(department: Department): ResultSet
}

trait ProjectTrait {
  def add(project: Project): Int

  def delete(project: Project): Int

  def update(project: Project): Int

  def read(project: Project): ResultSet
}



