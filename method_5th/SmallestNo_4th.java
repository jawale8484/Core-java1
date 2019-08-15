package comp.hef.method_5th;

import java.util.Scanner;

public class SmallestNo_4th {
	static int num1, num2, num3, temp;

	void smallest() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		num2 = sc.nextInt();
		System.out.println("Enter 3rd number");
		num3 = sc.nextInt();

		temp = (num1 < num2) ? ((num1<num3) ? num1:num3):num2;		//ternary operator (condition)?true:false;
		//int min = (num3 < temp) ? num3 : temp;

		System.out.println("smallest number is " + temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestNo_4th ob = new SmallestNo_4th();
		ob.smallest();

	}

}