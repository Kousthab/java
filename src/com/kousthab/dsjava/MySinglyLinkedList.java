package com.kousthab.dsjava;

public class MySinglyLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public static MySinglyLinkedList insert(MySinglyLinkedList list,int data){
		Node new_node=new Node(data);
		new_node.next=null;
		
		if(list.head==null){
			list.head=new_node;
		}
		else{
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	public static void printList(MySinglyLinkedList list){
		System.out.println("My SinglyLinkedList: ");
		Node curr_node=list.head;
		while(curr_node!=null){
			System.out.println(curr_node.data+" ");
			curr_node=curr_node.next;
		}
	}
	public static void main(String[] args) {
		MySinglyLinkedList list=new MySinglyLinkedList();
		list=insert(list, 4);
		list=insert(list, 5);
		list=insert(list, 7);
		list=insert(list, 9);
		
		printList(list);
	}

}
