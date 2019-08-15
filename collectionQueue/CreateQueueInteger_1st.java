package com.hefshine.collectionQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

//1.	WAP to create a Queue with Integer objects 
public class CreateQueueInteger_1st {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		System.out.println("Enter Integer type element in Queue");
		for (int i = 0; i < 5; i++) {
			pq.offer(sc.nextInt());
		}

		System.out.println("It can hold only Integer type value");
		System.out.println(pq);
	}
}
