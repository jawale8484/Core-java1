package com.hef.loops_HW3rd;

import java.util.Scanner;

public class palindrome_4th {

	public static void main(String[] args) {

		int num, temp = 0, remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		int originlintger = num;

		// reversed integer is stored in variable
		while (num != 0) {
			remainder = num % 10;
			temp = temp * 10 + remainder;
			num /= 10;
		}

		// palindrome if orignalInteger and reversedInteger are equal
		if (originlintger == temp)
			System.out.println(originlintger + " is a palindrome.");
		else
			System.out.println(originlintger + " is not a palindrome.");
	}
}
