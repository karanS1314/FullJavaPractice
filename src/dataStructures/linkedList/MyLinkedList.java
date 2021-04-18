package dataStructures.linkedList;

import java.util.*;

public class MyLinkedList {
	
	Node head=null;
	
	 void add(int data) {
		Node toAdd=new Node(data);
		
        if(head==null) {
        	head=toAdd;
        }
        else {
        	Node temp=head;
        	while(temp.next!=null) {
        		temp=temp.next;
        	}
        	temp.next=toAdd;
        }
	 }
	 
	 void print() {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.print(temp.data+ " ");
			 temp=temp.next;
		 }
	 }
      
	static class Node{
		int data;
		Node next;
		
		 Node(int data) {
			this.data=data;
			next=null;
		}
	}


}
