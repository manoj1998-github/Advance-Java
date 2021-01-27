package com.jspiders.ds.CircularLinkedList;



public class Mainmethod {

	public static void main(String[] args) {

		 CircularLinkedList sl=new CircularLinkedList(1888);
	        
	        sl.insertLinkedList(10,5);
	        sl.insertLinkedList(20,1);
	        sl.insertLinkedList(30,2);
	        sl.insertLinkedList(40,3);
	        sl.insertLinkedList(50,4);
	        
	        sl.traverseLinkedlist();
	        sl.searchNode(30);
	        sl.deleteNode(5);
	        sl.traverseLinkedlist();
	}

}
