package com.hef.inheritance;

import java.util.Scanner;

//3.	Explain the concept of hierarchical inheritance by suitable example.
class Institute {
	String name,sub;
	int year;
Scanner sc=new Scanner(System.in);
	String input() {

		System.out.println("Enter name");
		return name=sc.next();
	}
}

class Student extends Institute {
	void  classroom() {
		System.out.println("Enter passing year");
		year=sc.nextInt();
		System.out.println("student name "+name+"\npassing year "+year);
	}
}

class Teacher extends Institute {
	 void subject() {
		System.out.println("Enter subject");
		sub=sc.next();
		System.out.println("teacher name:-"+name+"\nteaching subject:-"+sub);
			
	}
}

public class hierachical_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob1=new Student();
		ob1.input();
		ob1.classroom();
																			//one class extended by 2 child class
		Teacher ob2=new Teacher();
		ob2.input();
		ob2.subject();
		
	}

}
