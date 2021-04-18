package gfgSets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZeroSumSubarray {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int sum=0;
			boolean present =false;
			Set<Integer> set=new HashSet<>();
			for(int i=0;i<n;i++) {
				set.add(0);
				sum+=a[i];
				if(set.contains(sum)) {
					present=true;
					break;
				}
				set.add(sum);
			}
			if(present) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
