package com.hef.oops_4th;

import java.util.Scanner;

public class No_ofDays_3rd {
void DaysCount() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int no = sc.nextInt();
	int days =((no==0)?0: (no>=8 && no<=12)?((no%2==0)?31:30):((no==2)?28:(no%2==0)?30:31));
	if (days==0)
		System.out.println("invalid choice");
	else
		System.out.println("The Month Have "+days+" Days");

	
	
}
	public static void main(String[] args) {
		
		
		
		
		/*if(no>=8 && no<=12) {
			
			if(no%2==0) {
				
				System.out.println("The Month Have 31 Days");
				
			}
			else {
				
				System.out.println("The Month Have 30 Days");
				
			}
			
		}
		else {
			
			if(no == 2) {
				
				System.out.println("The Month Have 28 Days");
			}
			else {
			if(no%2==0) {
				
				
				
				System.out.println("The Month Have 30 Days");
			}
			else {
				System.out.println("The Month Have 31 Days");
			}
			}	
			
	}
*/
		No_ofDays_3rd ob=new No_ofDays_3rd();
		ob.DaysCount();
			}

}
