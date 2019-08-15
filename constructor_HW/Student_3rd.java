package comp.hef.constructor_HW;
//3.Create class student and write a meaningful program with 2 constructors (default and parameterized), 3 methods 

// (1 with return type (calculating percentage), 1 without return type (displaying student data), 1 with parameter list).

import java.util.Scanner;

public class Student_3rd {
	static Scanner sc = new Scanner(System.in);

	Student_3rd() {

		System.out.println("This is no args constructor");

	}

	Student_3rd(int a) {
		System.out.println("This is parameterized constructor");
	}

	float GetPercentage() {
		System.out.println("Enter the marks of chemistry ");
		int chem = sc.nextInt();
		System.out.println("Enter the marks of computer");
		int comp = sc.nextInt();
		System.out.println("Enter the marks of physics");
		int phy = sc.nextInt();
		System.out.println("Enter the marks of geology");
		int geo = sc.nextInt();

		int obtain_marks = chem + comp + phy + geo;
		float percentage = obtain_marks * 100 / 400;

		return percentage;
	}
	void DisplayData() {
		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter Student roll no");
		int r_no=sc.nextInt();
		System.out.println("Enter course");
		String course=sc.next();
		System.out.println("Student Name: "+name+"\n Student Roll Number "+r_no+"\n Course: "+course);
		
	}
void method(int a,int b) {
	
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student_3rd ob=new Student_3rd();
float percentage=ob.GetPercentage();

System.out.println("Yor percentage is "+percentage);
ob.DisplayData();	
	
	
	}

}
