package geeksForGeeks;

import java.util.Scanner;

public class FirstAndLastX {
	static int first_pos(long a[],int n,long x) {
		int l=0;
		int r=n-1;
		
		int firstpos=n;
		while(l<r) {
			int mid=l+(r-l)/2;
			if(x<=a[mid]) {
				firstpos=mid;
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return firstpos;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		
		while(t>0) {
			int n=sc.nextInt();
			long a[]=new long[n];
			for(int j=0;j<n;j++) {
				a[j]=sc.nextLong();
				}
			long x=sc.nextInt();
			
			int first_occ=first_pos(a, n, x);
			int last_occ=first_pos(a, n, x+1)-1;
			if(first_occ<=last_occ)
			System.out.println(first_occ+ " "+ last_occ);
			else
				System.out.println(-1+ " " +-1);
			
			t--;
		}
		
	}

}
