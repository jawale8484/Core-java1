package comp.hef.method_5th;

import java.util.Scanner;

public class Calculator_8th {
	
		int a,b,sum,difference;
	int CalculatorSum() {
		
		
	Scanner sc=new Scanner(System.in); 	
	System.out.println("Enter 1st value");
	a=sc.nextInt();
	System.out.println("Enter 2nd value");
	b=sc.nextInt();	
	
		sum=a+b;
		return sum;
	}
	int CalculateDifference() {
		
		difference=a-b;
		return difference;
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator_8th ob=new Calculator_8th();
ob.CalculatorSum();
ob.CalculateDifference();
int x=ob.sum;					//it catch the return value
int y=ob.difference;			//it catch the return value
System.out.println("method 1) sum is="+x);
System.out.println("method 2) difference is="+y);


	}

}
