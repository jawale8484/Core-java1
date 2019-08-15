package com.hef.abstrat_Interface;
//4.Show use of parameterized constructor of parent class 
//(Child class invokes parent’s parameterized constructor) using super 


public class Parent_4th {
public Parent_4th(int a,String name) {
	// TODO Auto-generated constructor stub
System.out.println(a+" \n"+name);
}
}
class Child2 extends Parent_4th{

	public Child2(){
		super(1, "rohit");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Child2 ob=new Child2();
		
	}
}