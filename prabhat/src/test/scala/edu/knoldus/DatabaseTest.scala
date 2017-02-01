package edu.knoldus.daoimp
import java.sql.ResultSet

import edu.knoldus.model.Employee
import org.scalatest.FunSuite


class DatabaseTest extends FunSuite{

  val check=new EmployeeOperations
  test("Should delete a value"){
    assert(check.delete(Employee(123,"Anuj","subhash Nagar",999,111,333)) > 0)
  }
  test("Should insert a value") {
    assert(check.add(Employee(123,"Anuj","subhash Nagar",999,111,333)) > 0)
  }
  test("Should read a value") {
    assert(check.read(Employee(123,"Anuj","subhash Nagar",999,111,333)) ==ResultSet)
  }

  test("Should read with department id") {
    assert(check.getWithDepartmentId(2) ==ResultSet)
  }

  test("Should read with projectId id") {
    assert(check.getWithProjectId(4) ==ResultSet)
  }
}
