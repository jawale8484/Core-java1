package com.hefshine.Multithreading;

class class1 extends JoinThree {
	public static Thread t2;

	public void run() {
		t2 = Thread.currentThread();
		for (char i = 'a'; i < 'h'; i++) {
			try {
				t1.join(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("class 1" + i);
		}
	}
}

class class2 extends class1 {
	public static Thread t3;

	public void run() {
		t3 = Thread.currentThread();
		
		for (int i = 11; i <= 20; i++) {
			try {
				t2.join(100000, 100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("class 2 " + i);
		}
	}
}

class class3 extends class2 {
	
	public void run() {
		for (int i = 21; i <= 30; i++) {
			try {
				t3.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("class 3 " + i);
		}
	}
}

public class JoinThree extends Thread {
	public static Thread t1;

	public void run() {
		t1 = Thread.currentThread();
		for (int i = 0; i < 10; i++) {

			System.out.println("main " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JoinThree jointhree = new JoinThree();
		
		class1 cl1 = new class1();

		class2 cl2 = new class2();

		class3 cl3 = new class3();

		// thread start
		
		jointhree.start();
		
		cl1.start();
		
		cl2.start();
		
		cl3.start();
	}

}
