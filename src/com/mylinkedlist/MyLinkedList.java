package com.mylinkedlist;

import java.util.LinkedList;

public class MyLinkedList {
	LinkedList<Integer> list = new LinkedList<>();
	/*
	 * UC-5:  Ability to remove first element
	 */
	public void pop() {
		list.remove();
	}
	
	public void add(Integer i) {
		list.add(i);
	}
	
	/*
	 * UC-4: Ability to insert 30 between 56 and 70
	 */
	public void insert(int index, Integer item) {
		list.add(index, item);
	}
	public static void main(String[] args) {
		
		
		
		MyLinkedList ls = new MyLinkedList();
		ls.add(56);
		ls.add(70);
		System.out.println(ls.list);
		ls.insert(1, 30);
		System.out.println(ls.list);// [56, 30, 70]		
		ls.pop();
		System.out.println(ls.list);//[30, 70]
		
	}
}
