package comp.hef.constructor_HW.prblm_stmt;
/*
problem stmt 1
Create a class Circle.java in a package “com.HefShine.shapes” , add a float instance variable radius and add a 
default constructor (Constructor 1) for the class. This constructor should initialize the radius to a default value 1.5f. 
The above constructor should be invoked from a main method from another class, Shape.java 
(in different package com.HefShine. geometry). 

*//*
Problem Statement 2: Overloading constructors and using “this” keyword.
In the Circle.java class created above add an instance float variable pi and create two overloaded constructors.
Constructor 2- with a float argument name radius. The constructor should initialize the class variable radius  with 
the method argument radius.
NOTE:   The instance variable and the method argument should be named same as “radius”.

In Circle.java, invoke the Constructor 3 created in the previous step from Constructor 2.
*/
public class Circle {
float radius;
float pi;
public Circle() {
	// TODO Auto-generated constructor stub
	radius=1.5f;
	
}
public Circle (float radius){
	
	this.radius=radius;
}

}
