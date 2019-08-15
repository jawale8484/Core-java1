package controlstmt_HW2nd;

import java.util.Scanner;

public class Maxof3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number");
int num1=sc.nextInt();
System.out.println("Enter 2nd number");
int num2=sc.nextInt();
System.out.println("Enter 3rd number");
int num3=sc.nextInt();

if (num1>num2 && num1>num3) {
	System.out.println("Number 1 is greater");
}else if(num2>num1 &&num2>num3)
	System.out.println("number 2 is greater");
else
	System.out.println("number 3 is greater");
	}

}
