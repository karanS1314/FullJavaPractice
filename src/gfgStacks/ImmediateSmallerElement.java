package gfgStacks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ImmediateSmallerElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
//			Stack<Integer> b=new Stack<>();
//			ArrayList<Integer> c=new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
//			for(int i=n-1;i>=0;i--) {
//				b.push(a[i]);
//			}
//			while(!b.empty()) {
//				int m=b.pop();
//				if(!b.empty()) {
//				if(m>b.peek()) {
//					c.add(b.peek());
//				}
//				
//				else {
//					c.add(-1);
//				}
//				}
//				else {
//					c.add(-1);
//				}
//			}
//			
//			for(int i=0;i<c.size();i++) {
//				System.out.print(c.get(i)+ " ");
			
			for(int i=1;i<n;i++) {
				if(a[i-1]>a[i]) {
					a[i-1]=a[i];
				}
				else {
					a[i-1]=-1;
				}
			}
			a[n-1]=-1;
			
			for(int e:a) {
				System.out.print(e+ " ");
			}
				
			}
			
			
			
		}

	}


