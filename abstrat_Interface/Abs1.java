package com.hef.abstrat_Interface;
/*1.Create 2 abstract classes Abs1 and Abs2 each with different implemented methods doAbs1() and doAbs2() respectively. 
Check if 
you can create a class Temp which extends both the abstract classes. (Note- A class cannot extend 2 classes simultaneously)
*/
abstract class Abs1{
void doAbs() {
	
}
}
abstract class Abs2{
	void doAbs() {
		
	}
}
class Temp extends Abs1,  Abs2{					//java doesnt support multiple inheritance
	
}