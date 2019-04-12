package com.kousthab.dsjava2;

public class Runner {

	public static void main(String[] args) {
		MySLL list=new MySLL();
		list.insert(15);
		list.insert(4);
		list.insert(20);
		list.insertAtStart(2);
		list.insertAt(2, 18);
		list.insertAt(0,10);
		
		//list.deleteAtStart();
		list.show();
		list.deleteAtStart();
		list.show();
		list.deleteAtEnd();
		list.show();
		list.deleteAt(3);
		list.show();
		list.reversemsll();
		//list.deleteAt(3);
		
		//list.show();
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		MyCSLL list2=new MyCSLL();
		list2.insertAtBeg(10);
		list2.show();
		list2.insertAtBeg(20);
		list2.show();
		//list2.insertAt(2, 15);
		//list2.show();
		list2.insertAtEnd(30);
		list2.show();
		list2.insertAtEnd(13);
		list2.show();
		list2.insertAtBeg(11);
		list2.show();
		//list2.insertAt(3, 47);
		//list2.show();

	}

}
