package comp.hef.method_5th;

import java.util.Scanner;

/*11.	Create a class Account containing following methods :
insert() to insert account data
display() to display account information
deposit() to deposit amount
withdraw() to withdraw amount 
checkbalance() to check balance
e.g. 
	class Account{ 
		intacc_no; 
		String name;
		float amount; 
	}
*/
public class Account_11th {
int acc_no;
String name;
float amount;
static Scanner sc=new Scanner(System.in);

	void Insert() {
		System.out.println("Enter account number");
		acc_no=sc.nextInt();
		System.out.println("Enter your name ");
		name=sc.next();											//name=sc.nextLine();
		System.out.println("Enter amount");
		amount=sc.nextFloat();
	}
	void Display() {
			System.out.println("Your account number is "+acc_no);
			System.out.println("Your name is "+name);
			System.out.println("Your amount is "+amount); 		
	}
	void Deposit() {
		int a;
		System.out.println("Enter amount to deposit");
		a=sc.nextInt();
		
		amount=amount+a;
		System.out.println("Balance "+amount);
	}
	void WithDraw() {
		
		int a;
		System.out.println("Enter amount to Withdraw");
		a=sc.nextInt();
		
		amount=amount-a;
		System.out.println("Balance "+amount);
		
	}
	void CheckBalance() {
		System.out.println("your Account number"+acc_no);
		System.out.println( "Your name"+name);
		System.out.println("Upadated balance"+amount);
	}
	static int a;
	void menu() {
		
		System.out.println("Enter your choice\n1) Display account detail\n2) Deposit money\n3) withdraw money \n4) Check balance\n5) Quit");
		a=sc.nextInt();
	}
	/*void exit() {
		System.out.println("System sucessfully terminated");
	}
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account_11th ob=new Account_11th();

ob.Insert();

ob.menu();
//System.out.println(a);
while(a!=5) {	
switch(a){
	case 1: ob.Display();ob.menu();
	break;
	case 2:ob.Deposit();ob.menu();
	break;
	case 3:ob.WithDraw();ob.menu();
	break;
	case 4:ob.CheckBalance();ob.menu();
	break;
	case 5:System.exit(0);						//ob.exit();
	break;
	default:System.out.println("invalid option");
	
	}
}
	}
/*
ob.Insert();
ob.Display();
ob.Deposit();
ob.WithDraw();
ob.CheckBalance();

*/
	}


