package special;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ZeroSumSubarrays {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
		  int n=sc.nextInt();
		  long a[]=new long[n];
		int sum=0;
		int count=0;
		  Map<Long,Integer> map=new HashMap<>();
		  for(int i=0;i<n;i++) {
			  a[i]=sc.nextLong();
			  sum+=a[i];
			  a[i]=sum;
//			  System.out.println(a[i]);
			  if(!map.containsKey(a[i])) {
				  map.put(a[i], 0);
				  if(a[i]==0) {
					  map.put(a[i],1);
				  }
			  }
			  count=map.get(a[i]);
			  count++;
			  map.put(a[i],count);
				 
			  }
			 
		int res=0;
		
		Set<Long> set=new HashSet();
		  for(int i=0;i<n;i++) {
			  if(!set.contains(a[i])) {
			int k=  map.get(a[i]);
//			System.out.print(k+ " ");
			res+=(k*(k-1))/2;
			  }
			  set.add(a[i]);
		  }
		  System.out.println(res);
		
		}
	}

}
