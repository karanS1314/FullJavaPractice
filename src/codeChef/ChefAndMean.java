package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndMean {
	static int binarySearch(long x,long a[],int n) {
		int res=-1;
		int l=0;
		int r=n-1;
		int mid=l+(r-l)/2;
		while(l<=r) {
			if(x<a[mid]) {
				r=mid-1;
			
			}
			else if(a[mid]<x) {
				l=mid+1;
			}
			else {
				res=mid;
				break;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			long a[]=new long[n];
			long b[]=new long[n];
			for(int i=0;i<n;i++) {
				b[i]=a[i]=sc.nextInt();
			}
			
			Arrays.sort(b);
	         double sum=0;
			for(int i=0;i<n;i++) {
				sum+=a[i];
			}
			
			double x=sum/n;
			long y=(long) (sum/n);
			if(y!=x) {
				System.out.println("Impossible");
			}
			else {
			if(binarySearch(y,b,n)!=-1) {
				for(int i=0;i<n;i++) {
					if(a[i]==y) {
						System.out.println(i+1);
						break;
					}
				}
			}
			else {
				System.out.println("Impossible");
			}
			}
			
		}
	}
}
