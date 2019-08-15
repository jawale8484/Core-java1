package controlstmt_HW2nd;

import java.util.Scanner;

public class billUnit_12th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter bill unit:");
int bill_unit=sc.nextInt();
double b_amount=0;

if (bill_unit<=50) {
	b_amount=bill_unit*0.50;
	
}else if (bill_unit<=100) {
	b_amount=bill_unit*0.75;
}else if (bill_unit<=250) {
	b_amount=bill_unit*1.20;
	
}else if (bill_unit>=250) {
	b_amount=bill_unit*1.50;
}

	//double amount=(b_amount/100)*20;
	System.out.println("Your bill amount is "+b_amount);
	
	}

}
