package codeForces.edu99;

import java.util.*;

public class C {
	
	static boolean sorted (int a[]) {
		int n = a.length;
		for(int i=0;i<n-1;i++) {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			sc.nextLine();
			char c[][] = new char[n][n];
			for(int i=0;i<n;i++) {
				String s = sc.nextLine();
				for(int j=0;j<n;j++) {
					c[i][j]=s.charAt(j);
				}
			}
			
			int r[] = new int[n];
			int col[]= new int[n];
			for(int i=0;i<n;i++) {	
				int count=0;
				for(int j=0;j<n;j++) {
					if(c[i][j]=='X') {
						count++;
					}
				}
				if(count<3 ) {
					r[i]=1;
				}
			}
			for(int j=0;j<n;j++) {
				int count=0;
				for(int i=0;i<n;i++) {
					if(c[i][j]=='X') {
						count++;
					}
				}
				if(count<3) {
					col[j]=1;
				}
			}
//			for(int e : r) System.out.print( e+ " ");
//			System.out.println();
//			for(int e : col) System.out.print( e + " ");
//			System.out.println();
			
			
			//r[i]=0 x winning
			for(int i=0;i<n;i++) {
				if(r[i]==0) {
					for(int j=0;j<n;j++) {
						if(col[j]==0) {
							c[i][j]='O';
							col[j]=1;
							break;
						}
					}
					r[i]=1;
				}
			}
			for(int j=0;j<n;j++) {
				if(r[j]==0) {
					for(int i=0;i<n;i++) {
						if(r[i]==0) {
							c[i][j]='O';
							r[i]=1;
							break;
						}
					}
					col[j]=1;
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(c[i][j]);
				}
				System.out.println();
			}
			
		}
	}

}
