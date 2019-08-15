package com.hefshine.Multithreading;

public class ImplementsRunnable implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
for(int i=0;i<5;i++) {
	System.out.println(i);
}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ImplementsRunnable ob=new ImplementsRunnable();
Thread obthread=new Thread(ob);
obthread.start();
	}

	
}
