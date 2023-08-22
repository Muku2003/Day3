package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emptable")
public class Employee {
@Id
private int id;
private String employeeName;
private String employeeAge;
private long salary;
public Employee() {
}
public Employee(int id, String employeeName, String employeeAge, long salary) {
	super();
	this.id = id;
	this.employeeName = employeeName;
	this.employeeAge = employeeAge;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeAge() {
	return employeeAge;
}
public void setEmployeeAge(String employeeAge) {
	this.employeeAge = employeeAge;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}


}
