package codeForces;

import java.util.Scanner;

public class PaintingEggs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[]= new int[n];
		int g[]= new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			g[i]=sc.nextInt();
		}
		StringBuffer s = new StringBuffer("");
		int diff=0;
		
		if(n==1) {
			if(a[0]<=g[0]) {
			System.out.println("A");
			}
			else {
			System.out.println("G");	
			}
		}
		else {
			if(Math.abs(a[0]-g[1])<Math.abs(-a[1]+g[0])) {
				s.append("AG");
				diff=a[0]-g[1];
			}
			else {
				s.append("GA");
				diff=a[1]-g[0];
			}
			
			for(int i=2;i<n;i++) {
				if(Math.abs(diff+a[i])<Math.abs(diff-g[i])) {
					diff+=a[i];
					s.append("A");
				}
				else {
					diff-=g[i];
					s.append("G");
				}
			}
			
			if(Math.abs(diff)<=500) {
				System.out.println(s);
			}
			else {
				System.out.println(-1);
			}
		}
		
		
		
		
		

	}

}
