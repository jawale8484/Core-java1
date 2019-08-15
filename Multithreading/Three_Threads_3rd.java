package com.hefshine.Multithreading;
//3.	Create 3 threads. First thread displays days of a week.
//Second thread displays table of 5.Third thread displays Fibonacci series.
public class Three_Threads_3rd {

	public static void main(String[] args) {
		Days day=new Days();
		day.start();
		Fibbo fibbo=new Fibbo();
		fibbo.start();
		Table5 table=new Table5();
		table.start();
	}
	
}
