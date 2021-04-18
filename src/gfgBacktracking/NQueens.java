package gfgBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class NQueens {
	static int count=0;
	static boolean isValid(int a[][],int n,int row,int col) {
		for(int i=row,j=col;i>=0;i--) {
			if(a[i][j]==1) {
				return false;
			}
		}
		
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			if(a[i][j]==1) {
				return false;
			}		
		}
		
		for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++) {
			if(j<n && i>=0) {
				if(a[i][j]==1) {
					return false;
				}		
			}
		}
		return true;
		}

	
	
	static void printQueens(int n,int a[][],int row,ArrayList<Integer> al) {
		if(row==n) {
			count=1;
			System.out.print("[");
			for(int i=0;i<al.size();i++) {
				System.out.print(al.get(i)+ " ");
			}
			System.out.print("] ");
			return;
		}
		for(int col=0;col<n;col++) {
			if(isValid(a, n, row, col)) {
				a[row][col]=1;
				al.add(col+1);
				printQueens(n,a,row+1,al);
				a[row][col]=0; // backtracking
				al.remove(al.size()-1); // backtracking
			}
		}
		return;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a[][]=new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=0;
				}
			}
			ArrayList<Integer> al=new ArrayList<>();
			printQueens(n,a,0,al);
			if(count==0) {
				System.out.print(-1);
			}
			System.out.println();
			count=0;
			
		}
	}

}
