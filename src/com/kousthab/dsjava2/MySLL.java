package com.kousthab.dsjava2;

public class MySLL {
	Node head;
	
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void insertAtStart(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	
	public void insertAt(int index,int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{	
			Node n=head;
			for(int i=1;i<index-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	public void deleteAtStart(){
		System.out.println("Deleted Item: "+head.data);
		head=head.next;
	}
	
	public void deleteAt(int index){
		if(index==0){
			deleteAtStart();
		}
		else{
			Node n=head;
			Node n1=null;
			for(int i=1;i<index-1;i++){
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("Deleted Item: "+n1.data);
		}
	}
	public void deleteAtEnd(){
		Node n=head;
		Node n1=null;
		while(n.next!=null){
			n1=n;
			n=n.next;
		}
		n1.next=null;
		System.out.println("Deleted Item: "+n.data);
		
	}
	
	public void reversemsll(){
		Node curr=head;
		Node next=null;
		Node prev=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		System.out.println("Reversed My Singly Linked List:");
		Node n=prev;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
		//System.out.println(n.data);
	}
	
	public void show(){
		Node n=head;
		System.out.println("My Singly Linked List: ");
		while(n.next!=null){
			System.out.print(n.data+ " ");
			n=n.next;
		}
		System.out.println(n.data);
	}

}
