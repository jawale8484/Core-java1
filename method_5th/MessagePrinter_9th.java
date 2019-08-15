package comp.hef.method_5th;

import java.util.Scanner;

public class MessagePrinter_9th {
	
	void PrintMessage(String a){
		
		System.out.println("printed string=="+a);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner sc=new Scanner(System.in);
MessagePrinter_9th ob=new MessagePrinter_9th();

		System.out.println("Enter a string ");
		a=sc.nextLine();
		ob.PrintMessage(a);		
		
		
	}

}
