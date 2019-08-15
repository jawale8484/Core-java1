package com.hefshine.Multithreading;

import java.util.Scanner;

public class Fibbo extends Thread{

	public void run() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number for fibbo");
		int fibbonumber = sc.nextInt();

		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 2; i < fibbonumber; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}

	}
	


}
