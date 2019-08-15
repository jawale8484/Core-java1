package com.hef.inheritance.EmpClass_9th;
/*
9.	Create Employee class which has attributes (id, name, salary, dept, mydate).
 Where dept and mydate is class, dept has (dept_id, dept_name) And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter

*/public class Department {

	int dept_id;
	String dept_name;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	Department(int dept_id,String dept_name){
		this.dept_id=dept_id;
		this.dept_name=dept_name;
				
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}
		
}
