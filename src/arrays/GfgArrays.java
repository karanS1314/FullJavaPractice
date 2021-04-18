package arrays;

import java.util.LinkedList;
import java.util.Scanner;

public class GfgArrays {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// LinkedList<Integer> ll = new LinkedList<>();
		
		
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		if(n%2 == 0) {
		
		for(int i=0;i<n/2;i++) {
			int temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
			
			}
		for(int i=0;i<n;i++) {
			System.out.print(a[i] +" ");
		}
	
		}else {
			
			for(int i=0;i<n/2-1;i++) {
				int temp=a[i];
				a[i]=a[n-i-1];
				a[n-i-1]=temp;
			
			}
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+ " ");
			
		}
		
			}

	
}}
