package com.hef.poly_encaps;


/*
4.	Create a class named 'Shape' with a method to print "This is shape class". 
Then create  another class named 'Rectangle' inheriting the Shape class, having a method to print 
"This is rectangular shape" .Create another class ‘circle ‘inheriting ‘rectangle’ class and create a method to print 
 "This is circular shape" respectively. 
Now call the method of 'Shape' and 'Rectangle' class by the object of ‘circle’ class.
*/
class Shape{
	void Print() {
		
		System.out.println("this is shape class");

	}
}


 class Rectangle extends Shape{
void Print() {
	super.Print();
	System.out.println("This is rectangular shape");
	
}
 }
public class Circle extends Rectangle{
	void Print() {
	super.Print();	
		System.out.println("This is circular shape");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle ob=new Circle();
ob.Print();

	}

}
