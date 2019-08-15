package controlstmt_HW2nd;

import java.util.Scanner;

public class check_char_digit_symbl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Character or digit or symbol");
char ch=sc.next().charAt(0);
//if (ch<=65||)
	if(ch>=65 && ch<=90|| ch >=97 && ch <= 122 )
		System.out.println("u entered character");
		
	else if (ch>=48&&ch<=57)
		System.out.println("You entered Digit");
	else if(ch>=33&&ch<=47)
		System.out.println("You entered Symbol");

}}
