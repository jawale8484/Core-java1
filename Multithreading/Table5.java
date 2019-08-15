package com.hefshine.Multithreading;

public class Table5 extends Thread{
public void run() {
	int num=5;
	int res=0;
	System.out.println("table of 5 is ");
	for(int i=1;i<=10;i++) {
		res=i*num;
		System.out.println(res);
	}
	
}

}
