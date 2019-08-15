package com.hefshine.Multithreading;

public class CharacterThread extends Thread {
	@Override
	public void run() {
		for (char i = 'a'; i <= 'h'; i++) {
			System.out.println(i);

		}
	
	}
}
