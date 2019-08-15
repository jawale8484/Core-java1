package com.hefshine.Array_HW;

import java.lang.reflect.Array;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

//11. WAP to put even and odd elements of array in two separate arrays.
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int Total[] = new int[size];

		System.out.println("Enter element in array");
		for (int i = 0; i < size; i++) {
			Total[i] = sc.nextInt();
		}
		System.out.println("Displayed element in array");
		for (int i = 0; i < size; i++) {
			System.out.print(Total[i] + " ");
		}
		int x = 0;
		int y = 0;
		for (int i = 0; i < size; i++) {
			if (Total[i] % 2 != 0) {
				x++;

			} else {
				y++;
			}
		}
		int odd[] = new int[y];
		int even[] = new int[x];
		int a = 0;
		int b = 0;
		for (int i = 0; i < size; i++) {
			if (Total[i] % 2 != 0) {
				odd[a++] = Total[i];
			} else {
				even[b++] = Total[i];
			}
		}
		System.out.println("\nOdd numbers are ");
		for (int i = 0; i < odd.length; i++) {
			System.out.println(odd[i]);
		}
		System.out.println("\nEven numbers are ");
		for (int i = 0; i < even.length; i++) {
			System.out.println(even[i]);
		}
	}
}
