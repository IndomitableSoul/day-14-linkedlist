package com.mylinkedlist;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		
		/*
		 * UC-1:created a simple Linked List of 56, 30 and 70
		 */
		LinkedList<Integer> list = new LinkedList<>();
		/*
		 *Ability to insert 30 between 56 and 70
		 *Final Sequence: 56->30->70
		 */
		list.add(56);
		list.add(70);
		System.out.println(list);
		list.add(1, 30);
		System.out.println(list);
		
	}
}
