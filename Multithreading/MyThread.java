package com.hefshine.Multithreading;

public class MyThread extends Thread{

	public static void main(String[] args) {
NumbersThread n1=new NumbersThread();
CharacterThread c1=new CharacterThread();
n1.start();
c1.start();
	}
}
