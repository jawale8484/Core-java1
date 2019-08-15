package com.hef.loops_HW3rd;

public class Pattern_13 {
	/*
	 * 1 
	 * 01
	 * 101
	 * 0101 
	 * 10101
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b, c;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				b = 1;
				c = 0;
			} else {
				b = 0;
				c = 1;
			}
			for (int j = 1; j <= i ; j++)
				if (j % 2 == 0) {
					System.out.print(b);

				} else {
					System.out.print(c);
				}System.out.println();

		}
	}

}
/*
 * int b,c; for(int i=1;i<=5;i++) { if(i%2==0) { b=1; c=0; } else { b=0; c=1; }
 * for(int j=1;j<=i;j++) { if(j%2==0) System.out.print(b); else
 * System.out.print(c);
 * 
 * } System.out.println();
 */
