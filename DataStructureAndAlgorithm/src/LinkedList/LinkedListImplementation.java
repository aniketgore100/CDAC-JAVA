package LinkedList;

import java.util.LinkedList;

public class LinkedListImplementation {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static LinkedListImplementation insert(LinkedListImplementation list, int data) {
		Node new_node = new Node(data);
		if(list.head == null) {
			list.head = new_node;
		}else {
			Node last = list.head;
			while(last.next != null ) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	public static void printList(LinkedListImplementation list) {
		Node currNode = list.head;
		System.out.println("Linkedlist");
		while(currNode != null) {
			System.out.println(currNode.data + " ");
			
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args) {
		Li
	}

}
