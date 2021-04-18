package geeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting0s1s2s {
	static void sort012(int a[],int n) {
//		int zeroes=0;
//		int ones=0;
//		int twos=0;
//		for(int i=0;i<n;i++) {
//			if(a[i]==0) {
//				zeroes++;
//			}
//			else if(a[i]==1) {
//				ones++;
//			}
//			else {
//				twos++;
//			}
//		}
//		
//			while(zeroes-->0) {
//				System.out.print("0"+ " ");
//			}
//			while(ones-->0) {
//                System.out.print("1"+ " ");
//			}
//			while(twos-->0) {
//				System.out.print("2"+ " ");
//			}
		Arrays.sort(a);
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int [n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			sort012(a,n);
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

}
