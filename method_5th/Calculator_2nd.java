package comp.hef.method_5th;

import java.util.Scanner;

//2.Create Calculator class which have 4 methods 
//add(int i, int j), sub(int i, int j), mul(int i, int j), div(int i, int j) 
//with return type double.
public class Calculator_2nd {
	
	static int i,j;
	void Input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		 i=sc.nextInt();
		System.out.println("Enter second number");
		j=sc.nextInt();
		}
	double add(int i,int j) {
		
		int result=i+j;
		return result;
		
	}
	double sub(int i,int j) {
		
		int result=i-j;
		return result;
	}
	double mul(int i,int j) {
		int result=i*j;
		return result;
	}
	double div(int i,int j){
		int result=i/j;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator_2nd ob=new Calculator_2nd();
		ob.Input();
		
		ob.add(i, j);
		ob.sub(i, j);
		ob.mul(i, j);
		ob.div(i, j);

		
		double add1=ob.add(i, j);
		double sub1=ob.sub(i, j);
		double mul1=ob.mul(i, j);
		double div1=ob.mul(i, j);
		
		System.out.println("addition is "+add1);
		System.out.println("Substraction is "+sub1);
		System.out.println("Multiplication is "+mul1);
		System.out.println("division is "+div1);
		
		
		
		
	}}