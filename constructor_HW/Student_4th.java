package comp.hef.constructor_HW;

import java.util.Scanner;

/*
4.	Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating object of Student class.
*/
public class Student_4th {
	Student_4th() {

		System.out.println("Unknown");

	}

	Student_4th(String a) {

		System.out.println("Name of the Student is " + a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student_4th ob = new Student_4th();
		System.out.println("Enter name of the student");
		String a = sc.next();
		Student_4th ob1 = new Student_4th(a);
	}

}
