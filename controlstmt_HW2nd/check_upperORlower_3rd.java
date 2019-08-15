package controlstmt_HW2nd;

import java.util.Scanner;

public class check_upperORlower_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Alphabet");
int a=sc.next().charAt(0);

if(a<97 && a<122)
{
	System.out.println("Alphabet is uppercase");
}else
	System.out.println("Alphabet is Lower case");
	}

	
	

}
