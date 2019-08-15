package com.hef.inheritance.EmpClass_9th;
/*
9.	Create Employee class which has attributes (id, name, salary, dept, mydate). 
Where dept and mydate is class, dept has (dept_id, dept_name) And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter

*/
public class Employee {
int id;
String name;
int salary;
Department dept;
 Mydate mydate;
public Employee() {
	// TODO Auto-generated constructor stub

}
Employee(int id,String name,int salary, Mydate mydate, Department dept){
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.dept=dept;
	this.mydate=mydate;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public Mydate getMydate() {
	return mydate;
}
public void setMydate(Mydate mydate) {
	this.mydate = mydate;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", mydate=" + mydate
			+ "]";
}

}



