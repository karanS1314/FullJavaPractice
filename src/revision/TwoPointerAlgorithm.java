package revision;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointerAlgorithm {
	
	static boolean tripletPresent(int a[],int n) {
		for(int i=0;i<n-2;i++) {
			int x=-a[i];
			if(sumPresent(a,n,x,i)) {
				return true;
			}
			
		}
		return false;
		
	}
	static boolean sumPresent(int a[],int n,int x,int d) {
		int i=d+1;
		int j=a[n-1];
		
		while(i<j) {
			if(a[i]+a[j]>x) {
				j--;
			}
			else if(a[i]+a[j]<x){
				i++;
		    }
			else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
			}
		
		Arrays.sort(a);
		
		boolean result=tripletPresent(a,n);
		if(result){
			System.out.println(1);
		}
		else {
				System.out.println(0);
		}
	}

}
