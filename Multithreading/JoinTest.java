package com.hefshine.Multithreading;

class Numbers1 extends Characteres {

	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				t.join();

			} catch (InterruptedException e) {
				e.getMessage();
			}

			System.out.println(i);
		}
	}
}

class Characteres extends Thread {
	public static Thread t;

	public void run() {
		t = Thread.currentThread();
		
		for (char i = 'a'; i <= 'h'; i++) {
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/System.out.println(i);
		}
	}
}

public class JoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers1 n1 = new Numbers1();
		Characteres c1 = new Characteres();
		c1.start();
		n1.start();
		
	}
}
