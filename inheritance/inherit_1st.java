package com.hef.inheritance;
//1.	Create a class with a method that prints "This is parent class" and its subclass with another method that prints

//	"This is child class". Now, create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class

class parent {
	void displayparent() {
		System.out.println("This is parent class");
	}
}

public class inherit_1st extends parent {

	void displaychild() {
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent ob1 = new parent();
		ob1.displayparent();

		
		inherit_1st ob2 = new inherit_1st();
		ob2.displaychild();

		
		inherit_1st ob3 = new inherit_1st();
		ob3.displayparent();
	}

}
