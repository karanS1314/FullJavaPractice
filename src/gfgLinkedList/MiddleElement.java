package gfgLinkedList;

import java.util.Scanner;

public class MiddleElement {
	
	static int middleElement(Node head) {
		Node hare=head;
		Node tort=head;
		while( hare!=null && hare.next!=null ) {
			hare=hare.next.next;
			tort=tort.next;
		}
		return tort.data;
	}

	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	
   
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			
			Node head=new Node(sc.nextInt());
			Node tail=head;
			
			for(int i=0;i<n-1;i++) {
				tail.next=new Node(sc.nextInt());
				tail=tail.next;
			}
			int ans=middleElement(head);
			System.out.println(ans);
		}
		
	}
	
		
	

}
