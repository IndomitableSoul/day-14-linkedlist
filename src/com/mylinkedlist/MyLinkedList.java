package com.mylinkedlist;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		
		/*
		 * UC-1:created a simple Linked List of 56, 30 and 70
		 */
		LinkedList<Integer> list = new LinkedList<>();
		/*
		 * Ability to create Linked List by adding 30 and 56 to 70
		 * LinkedList Sequence: 56->30->70
		 */
		list.add(70);
		list.addFirst(30);
		list.addFirst(56);
		System.out.println(list);
		
	}
}
