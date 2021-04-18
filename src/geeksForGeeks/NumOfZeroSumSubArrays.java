package geeksForGeeks;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class NumOfZeroSumSubArrays {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			long a[]=new long[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			
			LinkedList<Long> ll=new LinkedList<>();
			ll.add((long) 0);
			int count =0;
			long sum=0;
			for(int i=0;i<n;i++) {
				sum+=a[i];
				if(sum==0) {
					count++;
				}
				if(ll.contains(sum)) {
					count++;
					
				}
			    ll.
				
					
					ll.add(sum);
				}
				
			
			
			System.out.println(count);
		}
		}
	}

}
