package com.kousthab.dsjava2;

public class MyCSLL {
	Node head;
	Node tail;
	int size;
	
	public MyCSLL(){
		head=null;
		tail=null;
		size=0;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void insertAtBeg(int data){
		Node node=new Node(data,null);
		node.next=head;
		
		if(head==null){
			head=node;
			node.next=head;
			tail=head;	
		}
		else{
			tail.next=node;
			head=node;
		}
		size++;
	}
	
	public void insertAtEnd(int data){
		Node node=new Node(data,null);
		node.next=head;
		
		if(head==null){
			insertAtBeg(data);
		}
		else{
			tail.next=node;
			tail=node;
		}
		size++;
	}
	
	public void insertAt(int pos,int data){
		Node node=new Node(data,null);
		Node n=head;
		pos=pos-1;
		for(int i=1;i<size-1;i++){
			if(i==pos){
				Node temp=n;
				n.next=node;
				node.next=temp;
				break;
			}
			n=n.next;
		}
		size++;
	}
	
	public void show(){
		Node n=head;
		System.out.println();
		System.out.println("size of MyCSLL: "+size);
		System.out.println("My Circular Singly Linked List:");
		if(size==0)
		{
			System.out.println("Empty MyCSLL");
			return;
		}
		else if(head.next==head){
			System.out.print(head.data+"->"+n.data);
			return;
		}
		/*System.out.print(head.data+ "->");
        n = head.next;
		while(n.next!=head){
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.print(n.data+"->");
		n=n.next;
		System.out.print(n.data+"\n");*/
		else{
			do{
				System.out.print(n.data+"->");
				n=n.next;
			}while(n!=head);
			System.out.print(n.data);
		}
		
	}

}
