package com.hef.poly_encaps;
/*
6.	Create a class Cycle with member variables: int accountNo, int noOfWheels.
 Create a default constructor with a SOP in it “I am default constructor “Create another constructor which takes 2 
 arguments, calls the default constructor using this () and has a SOP in it “I am another constructor”.
  In main method, create an object of type Cycle by using default constructor. Note the output. 
  Create another object of type Cycle by using the parameterized constructor.
 Note the sequence of SOPs indicating that inner most constructors are called first.
*/
public class Cycle {
public Cycle() {
	
	System.out.println("I am default constructor");
	}
Cycle(int a,int b){
	this();
	System.out.println("I am another constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cycle ob=new Cycle();
Cycle ob1=new Cycle(1, 1);
	}

}
