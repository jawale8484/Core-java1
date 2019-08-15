package com.hefshine.collectionQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

//4.	WAP to remove an element from a queue
public class RemovefromQueue_4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer type element in Queue");
		for (int i = 0; i < 5; i++) {
			pq.offer(sc.next());
		}
		System.out.println("Before removing element "+pq);
	pq.remove();				//it remove the head element from queue
	System.out.println("After remove the element "+pq);
	}

}
