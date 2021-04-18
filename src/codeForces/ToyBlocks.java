package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class ToyBlocks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			long a[] = new long[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			Arrays.sort(a);
			long d=0;
			for(int i=1;i<n-1;i++) {
				d+=a[n-1]-a[i];
			}
//			System.out.println(d);
			if(d-a[0]>=0) {
				System.out.println(d-a[0]);
			}
			else {
				if(n-1>=(a[0]-d)) {
					System.out.println(n-1-(a[0]-d));
				}
				else {
					long re=(a[0]-d)%(n-1);
					if(re!=0) {
						System.out.println(n-1-re);
					}
					else {
						System.out.println(0);
					}
				}
			}
			
		}

	}

}
