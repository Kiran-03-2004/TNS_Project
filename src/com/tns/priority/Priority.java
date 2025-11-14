package com.tns.priority;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(9);
		pq.add(7);
		pq.add(8);
		pq.add(10);
		Iterator i = pq.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
