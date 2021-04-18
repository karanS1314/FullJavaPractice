package special;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			Deque<Integer> dq=new LinkedList<>();
			int b[]=new int[n-k+1];
			
			int i=0;
			for(;i<k;i++) {
				while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
	
			for(;i<n;i++) {
				b[i-k]=a[dq.peekFirst()];
				
				if(!dq.isEmpty() && dq.peekFirst()<=i-k) {
					dq.removeFirst();
				}
				while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
			b[n-k]=a[dq.peekFirst()];
			
			for(int e:b) {
				System.out.print(e+ " ");
			}
			System.out.println();
		}

	}

}
