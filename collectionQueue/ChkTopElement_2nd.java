package com.hefshine.collectionQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

//2.	WAP to check the top element in a queue
public class ChkTopElement_2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer type element in Queue");
		for (int i = 0; i < 5; i++) {
			pq.offer(sc.next());
		}
		System.out.println("Elements in Queue"+pq);
System.out.println("This is the first element in queue "+pq.element());
	}

}
