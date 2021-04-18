package gfgBacktracking;

import java.util.Scanner;

public class NumberOfPathsWithKCoins {

	static int ans=0;
	static void paths(int a[][],int k,int n,int i,int j,int sum) {
		
		
		if(i==n || j==n ) {
//			System.out.println(sum);
			return;
		}
		sum+=a[i][j];
		if(sum>k) {
			return;
		}
		if(i==n-1&&j==n-1&& sum==k) {
			ans++;
			return;
		}
		paths(a,k,n,i+1,j,sum);
		
		paths(a,k,n,i,j+1,sum);
		sum-=a[i][j];
		return;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int k=sc.nextInt();
			int n=sc.nextInt();
			
			int a[][]=new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			paths(a,k,n,0,0,0);
			System.out.println(ans);
			ans=0;
		}
		
	}

}
