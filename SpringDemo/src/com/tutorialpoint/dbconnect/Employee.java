package com.tutorialpoint.dbconnect;

public class Employee {  
private int id;  
private String name;  
private float salary;  

//no-arg and parameterized constructors  



public int getId() {
	return id;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

//getters and setters  

public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}


}  