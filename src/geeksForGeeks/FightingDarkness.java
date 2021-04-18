package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.util.List;

public class FightingDarkness {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
	        int n=sc.nextInt();
		
			long a[]=new long[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			
			Arrays.sort(a);
			
			long days=a[n-1];
			
			System.out.println(days);
			
			
			
	}

}
}