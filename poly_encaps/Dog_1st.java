package com.hef.poly_encaps;
class Animal{
	void move() {
		System.out.println("animal can move");
	}
	void eat() {
		System.out.println("animal eat for servive");
	}
}
public class Dog_1st extends Animal{
	
	void move() {
		System.out.println("dogs can move");
	}
	void bark() {
		System.out.println("Dogs bark for protection");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog_1st ob=new Dog_1st();
ob.move();
ob.bark();

Animal ob1=new Animal();
ob1.move();
ob1.eat();

	}

}
