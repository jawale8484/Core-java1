package com.hef.inheritance.problemstmt;

//5.	Create a class “InheritanceActivity.java” with a main method which performs the below functions,
/*	Create an instance of Manager class by calling the overloaded constructor with the below parameters,

Constructor parameter	Instance Variable
Id	126534
Name	"Peter"
Address	"Chennai India”
Phone	237844
Salary	65000

•	Invoke the calculateSalary method of the manager object. 
The salary calculated should be printed in the console.


long empId;
String empName;
String empAddress;
long empmo_no;
double empbasicsalary;
double spe_allownces=250.80;
double Hra=1000.50;


•	Create an instance of Trainee class by calling the overloaded constructor with the below parameters,
Constructor parameter	Instance Variable
Id	29846
Name	"Jack"
Address	"Mumbai India”
Phone	442085
Salary	45000

•	Invoke the calculateSalary method of the trainee object. 
The salary calculated should be printed in the console.


*/
public class InheritanceActivity {
	public static void main(String[] args) {
Manager manger=new Manager(126534, "Peter", "Chennai India", 237844, 65000);
manger.calculateSalary();
Trainee trainee=new Trainee(29846, "Jack", "Mumbai India",442085,45000);
trainee.calculateSalary();
	}


}
