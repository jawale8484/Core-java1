package com.hef.inheritance.EmpClass_9th;
/*
9.	Create Employee class which has attributes (id, name, salary, dept, mydate).
 Where dept and mydate is class, dept has (dept_id, dept_name) And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter

*/
public class Mydate {
int day;
int month;
int year;

public Mydate() {
	// TODO Auto-generated constructor stub
}
Mydate(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
			
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "Mydate [day=" + day + ", month=" + month + ", year=" + year + "]";
}



}
