package controlstmt_HW2nd;

import java.util.Scanner;

public class LeapYear_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter year:");
int year=sc.nextInt();
//boolean a=false;

//int a=1;int b=0;
if(year%4==0 && year%100!=0 && year%400==0)
System.out.println(year+" is leap year");
	
else 
	System.out.println(year+" is 'NOT'  leap year");
/*else if (year%400==0)
	System.out.println(year+" is leap year");
*/

	}

}
