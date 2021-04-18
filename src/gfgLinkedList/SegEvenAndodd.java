package gfgLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class SegEvenAndodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			LinkedList<Integer> ll=new LinkedList<>();
			for(int i=0;i<n;i++) {
				ll.add(sc.nextInt());
			}
			
			for(int i=0;i<n;i++) {
				if((ll.get(i)&1)==0) {
					System.out.print(ll.get(i)+ " ");
				}
			}
			for(int i=0;i<n;i++) {
				if((ll.get(i)&1)==1) {
					System.out.print(ll.get(i)+ " ");
				}
			}
			System.out.println();
		}

	}

}
