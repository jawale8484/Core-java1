package controlstmt_HW2nd;

import java.util.Scanner;

public class chekingno_2st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number you want to check: ");
int num=sc.nextInt();
if(num>0) {
	System.out.println("number is positive");
	
}else if(num<0) {
	System.out.println("Number is negative");
}else 
	System.out.println("number is "+num);
	}

}
