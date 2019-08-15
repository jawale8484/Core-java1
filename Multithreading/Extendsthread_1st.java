package com.hefshine.Multithreading;

public class Extendsthread_1st extends Thread {

	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extendsthread_1st extendsob = new Extendsthread_1st();
		extendsob.start();
		for (int i = 0; i < 4; i++) {

			System.out.println("main thread");
		}
	}

}
