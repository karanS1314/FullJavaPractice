package codeForces;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			int a[] = new int[n];
			
			boolean diff=false;
			boolean doub=false;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				
				if(i>=1 && a[i]!=a[i-1]) {
					diff=true;
				}
				if(i>=1 && Math.abs(a[i]-a[i-1])>=2) {
					doub = true;
				}
			}
			if(doub) {
				System.out.println(0);
			}
			else {
				if(diff) {
					System.out.println(Math.min(v, u));
				}
				else {
					System.out.println(Math.min(( 2*v),u+v));
				}
			}
			
			
			
		}

	}

}
