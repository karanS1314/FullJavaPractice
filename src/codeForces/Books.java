package codeForces;

import java.util.Scanner;

public class Books {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int i=0;
		int j=0;
		
		int sum =0;
		int mx=0;
		
		while(i<n && j<n) {
			if(sum+a[j]<=t) {
				sum+=a[j];
				mx=Math.max(mx, j-i+1);

			}
			else {
				sum-=a[i];
				sum+=a[j];
				
				i++;
			}
			
			j++;
		}
//		if(n==1 && t>=a[0]) mx=1;
		System.out.println(mx);

	}

}
