package com.hef.abstrat_Interface;
/*
2.	Check following variations:
	a.	Can we create an object of an abstract class?
	b.	Can we declare a class abstract with no methods in it?
	c.	Can we declare a class abstract even if it does not have any abstract method?
	d.	Can we declare an abstract class which has both abstract as well as implemented methods? 
	e.	Can a class extend 2 or more abstract classes?
	f.	Can an abstract class extend 2 or more abstract classes? 
	g.	Can an interface extend 1 or many abstract classes? 
	h.	Can an abstract class implements 1 or many interface? 

*/
class Test1 {

}
abstract class Abs1{					//2.yes we can declare abstract class with no method
										//3.yes we declare a class abstract even if it does not have any abstract method
}									//4.yes we declare an abstract class which has both abstract as well as implemented methods
class Test{							//5.no we cannt class extend 2 or more abstract classes
  public static void main(String []args) {
Abs1 ob=new Abs();								//1.cannot creat object of abstract class

	  
  }}
//6.no abstract class extend 2 or more abstract classes?
//7 no an interface extend 1 or many abstract classes
//8.no an abstract class implements 1 or many interface