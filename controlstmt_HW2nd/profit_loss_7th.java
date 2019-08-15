package controlstmt_HW2nd;

import java.util.Scanner;

public class profit_loss_7th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the buying amount of product");
int buy=sc.nextInt();
System.out.println("Enter the selling amount of product");
int sell=sc.nextInt();
if(buy<sell) {
	System.out.println("You have profit in ur business");
}else if(buy>sell) {
	System.out.println("Ohh You are in loss");
}else
	System.out.println("no profit no loss");
	}

}
