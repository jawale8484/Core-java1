package com.hef.abstrat_Interface;

import java.util.Random;

public class Randomex {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			
			i = r.nextInt(1000);
			System.out.println(i);
		}
		System.out.println(Math.random());
	}

}
