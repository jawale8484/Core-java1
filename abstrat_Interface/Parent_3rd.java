package com.hef.abstrat_Interface;
/*
3.	WAP to create an abstract class Parent. Add an abstract method cook() in it which has only 
definition and one method wash() which has implementation. Create class Child which extends Parent and 
add the missing method implementation. 
In main, use both the methods by creating instance of the concrete class.
*/
abstract class Parent_3rd {
abstract void Cook(); 
void wash() {
	System.out.println("Wash the cloths");
}
	

}
class child extends Parent_3rd{

	@Override
	void Cook() {
		// TODO Auto-generated method stub
		System.out.println("Cook the food");
	}
public static void main(String[] args) {
	child ob=new child();
	ob.wash();
	ob.Cook();
	
}	
}
