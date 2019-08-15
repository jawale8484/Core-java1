package com.hefshine.Array_HW;

import java.util.Scanner;



//15.	WAP to print the details of employees from Employee[] array who has same salary 
//(Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)

public class Employee {
	int emp_id;
	String name;
	static int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	Employee(int emp_id, String name, int salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;

	}

	void Display() {
		System.out.println("Emp id =" + emp_id + " Emp name =" + name + " Salary =" + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp[] = new Employee[3];

		emp[0] = new Employee(01, "peter", 20000);
		emp[0].Display();
		emp[1] = new Employee(02, "John", 70000);
		emp[1].Display();
		emp[2] = new Employee(03, "harry", 70000);
		emp[2].Display();
System.out.println("same salary");
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j < 2; j++) {
				if (emp[i].salary == emp[j].salary) {
					System.out.println(emp[i]);
				}
			}
		}

	}
}

