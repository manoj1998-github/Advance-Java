package com.jspiders.ds.LinkedList;

public class SingleLinkedList {

	private SingleNode head = null;
	private SingleNode tail = null;
	private int size = 0;

	public SingleLinkedList(int valueToBeInsert) {
		SingleNode node = new SingleNode();
		node.setValue(valueToBeInsert);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;
	}

	public void insertLinkedList(int valueToBeInsert, int location) {
		SingleNode node = new SingleNode();
		node.setValue(valueToBeInsert);
		if (head == null) {
			System.out.println("linked list doesnot exist");
		} else if (location == 0) {
			node.setNext(head);
			head = node;
			setSize((getSize()) + 1);// size is getting increased
		} else if (location >= getSize()) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
			setSize((getSize()) + 1);
		} else {
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			SingleNode next = tempNode.getNext();
			node.setNext(next);
			tempNode.setNext(node);
			setSize((getSize()) + 1);
		}
	}

	private boolean existLinkedList() {
	       
        return head!=null;
    }
	
	public void traverseLinkedlist() {
		if (!existLinkedList()) {
			System.out.println("linkedlist does not exist");
			return;
		}
		SingleNode tempNode = head;
		for (int i = 0; i < getSize(); i++) {
			System.out.println(tempNode.getValue());
			tempNode = tempNode.getNext();
		}
	}

	public void deleteLinkedlist() {
		System.out.println("linkedlist is deleting");
		head = null;
		tail = null;
		System.out.println("linkedlist is deleted");
	}

	public void searchNode(int valueToBeSearch) {
		SingleNode tempNode = head;
		if (!existLinkedList()) {
			System.out.println("linkedlist does not exist");
			return;
		} else {

			for (int i = 0; i < getSize(); i++) {
				if (tempNode.getValue() == valueToBeSearch) {
					System.out.println("Value to be serached" + i);
					return;
				}
				tempNode = tempNode.getNext();
			}
			System.out.println("value to be serached is not found");
		}

	}

	public void deleteNode(int location) {

		if (!existLinkedList()) {
			System.out.println("linkedlist does not exist");
			return;
		} else if (location == 0) {
			head.setNext(head.getNext());
			if (head == null) {
				tail = null;
			}
			setSize(getSize() - 1);
		} else if (location >= getSize()) {
			SingleNode tempNode = head;
			int index = 0;
			while (index < getSize() - 2) {
				tempNode = tempNode.getNext();
				index++;
			}
			if (tempNode == head) {
				head = tail = null;
				setSize(getSize() - 1);
				return;
			}
			tempNode.setNext(null);
			tail = tempNode;
			setSize(getSize() - 1);

		} else {
			SingleNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(tempNode.getNext().getNext());// next next value will be set for tempnode
			setSize(getSize() - 1);
		}

	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
