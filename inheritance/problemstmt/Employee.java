package com.hef.inheritance.problemstmt;
/*
Scenario: In a company there are employees with two designations Manager and Trainee. 
Both employees share the same set of attributes and basic salary calculation logic is same but the 
basic salary of trainee and manager are different.
The Manager has a travel allowance equal to 15% of the basic salary, whereas all the other employees the travel 
allowance is 10% of the basic salary. Write a program to maintain the entities using inheritance.

1.	Create a class Employee with the following instance variables.

Instance variables	Data type
employeeId	long
employeeName	String
employee Address	String
employee Phone	Long
basicSalary	double
specialAllowance	double  default value- 250.80
Hra	double,default value- 1000.50


*/
public class Employee {
long empId;
String empName;
String empAddress;
long empmo_no;
double empbasicsalary;
double spe_allownces=250.80;
double Hra=1000.50;


/*
2.	Create an overloaded constructor in the employee class, which takes the below constructor
 parameters and initializes them to their respective instance variables.

Constructor parameter	Instance Variable
Id	employeeId
Name	employeeName
Address	employeeAddress
Phone	employeePhone
3.	C

*/
public Employee() {
	// TODO Auto-generated constructor stub
}
Employee(String empname,String empAddress,long empmo_no){
	this.empName=empname;
	this.empAddress=empAddress;
	this.empmo_no=empmo_no;
	
}
/*
3.	Create a method calculateSalary in which the basic salary needs to be calculated as below.
salary = basicSalary + (basicSalary *specialAllowance/100) + (basicSalary *hra/100);
The calculated salary should be displayed in the console.
       NOTE: salary is a local variable.

*/

void calculateSalary() {
	
	double salary;
	salary=empbasicsalary+(empbasicsalary*spe_allownces/100)+(empbasicsalary*Hra/100);
	System.out.println("calculated salary is "+salary);
	
}

















}