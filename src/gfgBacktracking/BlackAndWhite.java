package gfgBacktracking;

import java.util.Scanner;

public class BlackAndWhite {
	static int sum=0;
	static void check(int a[][],int row,int col,int n,int m) {
	
//		for(int i=0;i<n;i++) {
//			if(a[i][col]==0) {
//				sum++;
//			}
//		}
//		for(int j=0;j<m;j++) {
//			if(a[row][j]==0) {
//				sum++;
//			}
//		}
		for(int i=row+1,j=col+1;i<n&&j<m;i++,j++) {
			sum++;
		}
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
			sum++;
		}

		for(int i=row-1,j=col+1;i>=0&&j<m;i--,j++) {
			sum++;
		}
//
		for(int i=row+1,j=col-1;i<n&&j>=0;i++,j--) {
			sum++;
		}

		
	}

	static void res(int a[][], int n , int m , int row,int col) {
		if(row==n) {
			return;
		}
		if(a[row][col]==0) {
		for(int i=0;i<m;i++) {
			
			a[row][i]=1;
			check(a,row,col,n,m);
			
			res(a, n, m, row+1,i);
			
			}
		}
		
		return;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[][]=new int[n][m];
			
			sum=n*m*(n+m-2);
			res(a,n,m,0,0);
			System.out.println(sum);
			
		}
	}

}
