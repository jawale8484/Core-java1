package comp.hef.method_5th;

import java.util.Scanner;

public class Overloading_3rd {
 static int i,j;
	void Input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		 i=sc.nextInt();
		System.out.println("Enter second number");
		j=sc.nextInt();
				
}
	void method1() {
		int result=i+j;
		
		System.out.println("method 1 addition is "+result);
	}
	
	void method1(int i) {
		System.out.println(i+" "+j);
		int result =i-j; 
		System.out.println("method substraction 2"+result);
		
		
	}
	void method1(int i,int j) {
		int result =i*j;
		System.out.println("method 3rd"+result);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading_3rd ob=new Overloading_3rd();
ob.Input();
ob.method1();
ob.method1(i);
ob.method1(i, j);
	}

}
