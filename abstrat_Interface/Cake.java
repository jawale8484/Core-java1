package com.hef.abstrat_Interface;
/*
5.	Create interface Cake with a method declared as bake. Create 2 classes Strawberry, 
BlackForest both implementing Cake interface Create interface IceCream with method eat and Juice with method drink. 
 Create class Mango which implements both interfaces.
*/

public interface Cake {
 void Bake();
}
class Strawberry implements Cake{
	public void Bake() {
		System.out.println("bake the Strawberry cake");
		
	}
}
class BlackForest implements Cake{

	@Override
	public void Bake() {
		// TODO Auto-generated method stub
		System.out.println("bake Blackforest cake");
	}
	
}
interface Icecream{
	void Eat(); 
	
}
interface Juice{
	void Drink();
	}
 class Mango implements Cake,Icecream{
	
	 @Override
		public void Bake() {
		 System.out.println("mango cake is baked");
		 // TODO Auto-generated method stub
			
		}
	 @Override
		public void Eat() {
			// TODO Auto-generated method stub
		System.out.println("Eat mango cake");	
		}
		
 public void Drink() {
		System.out.println("Drink Juice");
	}
	 public static void main(String[] args) {
		Mango ob=new Mango();
		ob.Bake();
		ob.Eat();
	
	ob.Drink();
	 
	 
	 }
	
}