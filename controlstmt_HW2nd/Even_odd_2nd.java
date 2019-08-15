package controlstmt_HW2nd;

import java.util.Scanner;

public class Even_odd_2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc=new Scanner(System.in);

int a,b;
System.out.println("Even numbers are:");
for(a=1;a<=100;a++)
	
if(a%2==0) {
	
	System.out.print(" "+a);
	}
System.out.println("\nodd numbers are:");
for(a=1;a<=100;a++)
	if (a%2!=0) {
		
	System.out.print(" "+a);
	}
	}
}
