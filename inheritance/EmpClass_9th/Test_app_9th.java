package com.hef.inheritance.EmpClass_9th;

public class Test_app_9th {

	public static void main(String[] args) {
		Department deptob=new Department();
		deptob.setDept_id(102);
		deptob.setDept_name("IT");

		Mydate mydateob=new Mydate();
		mydateob.setDay(10);
		mydateob.setMonth(11);
		mydateob.setYear(2017);
		
		Employee emp=new Employee();
		emp.setId(1001);
		emp.setName("rohit");
		emp.setSalary(25000);
		emp.setDept(deptob);
		emp.setMydate(mydateob);
		
		System.out.println(emp);
	}


}
