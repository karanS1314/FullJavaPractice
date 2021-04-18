package codeForces;

import java.util.Scanner;

public class NumberBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			int negativeCount=0;
			int sm=0;
			int lowest=Integer.MAX_VALUE;
			boolean containsZero=false;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					a[i][j]=sc.nextInt();
					sm+=Math.abs(a[i][j]);
					if(a[i][j]==0) {
						containsZero=true;
					}
					if(a[i][j]<0) {
						negativeCount++;
					}
					lowest=Math.min(Math.abs(a[i][j]),lowest);
				}
			}
			if(negativeCount%2==0 || containsZero) {
				System.out.println(sm);
			}
			else {
				System.out.println(sm-2*lowest);
			}
			
			
			
		}

	}

}
