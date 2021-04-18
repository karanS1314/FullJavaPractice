package codeForces;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] [] = new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(i-1>=0 && a[i][j]==a[i-1][j]) {
						a[i][j]+=1;
					}
					if(j-1>=0 && a[i][j]==a[i][j-1]) {
						a[i][j]+=1;
					}
					if(i+1<n && a[i][j]==a[i+1][j]) {
						a[i][j]+=1;
					}
					if(j+1<m && a[i][j]==a[i][j+1] ) {
						a[i][j]+=1;
					}
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
		}

	}

}
