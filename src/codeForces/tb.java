package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class tb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			long sum=0;
			long pre=0;
			long a[] = new long[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				sum+=a[i];
				if(a[i]>pre) {
					pre=a[i];
				}
			}
			
			long c = (n-1)*pre - sum;
			while(c<0) {
				c+=n-1;
			}
			
			System.out.println(c);
		}

	}

}
