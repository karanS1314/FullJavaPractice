package geeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class PossibleTriangles {
	public static int smallerSides(int i,int a[],int x) {
		int combos=0;
		
			int l=0;
			int r=i-1;
			while(l<r) {
			if(a[l]+a[r]==x || a[l]+a[r]<x) {
				l++;
			
			}
			else if(a[l]+a[r]>x) {
				
				combos+=r-l;
				
				r--;
				
			}
		}	
		
		return combos;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0) {
			int n=sc.nextInt();
			int a[]=new int [n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			
			int result=0;
			
			for(int i=n-1;i>=2;i--) {
			    result+=smallerSides(i, a, a[i]);
			}
			
			System.out.print(result);
			System.out.println();
			t--;
		}
		
	}

}
