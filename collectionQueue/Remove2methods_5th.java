package com.hefshine.collectionQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

//5.	Use 2 different method calls to remove elements from a queue
public class Remove2methods_5th {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer type element in Queue");
		for (int i = 0; i < 5; i++) {
			pq.offer(sc.next());
		}
		System.out.println("Before removing element " + pq);
		pq.remove(); // it remove the head element from queue
		System.out.println("After remove the  first element " + pq);
		System.out.println("poll method give first element of the queue");
		System.out.println(pq.poll());
	}
}
