package gfgRecursion;

import java.util.Scanner;

public class OptimalCoinGame {
	static int OpStrategy(int a[],int l,int r) {
		if(l+1==r) {
			return Math.max(a[l], a[r]);
		}
		return Math.max(a[l]+ Math.min(OpStrategy(a,l+2,r), OpStrategy(a,l+1,r-1)), 
				        a[r]+ Math.min(OpStrategy(a,l,r-2), OpStrategy(a,l+1,r-1)));
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println(OpStrategy(a,0,a.length-1));
			
		}

	}

}
