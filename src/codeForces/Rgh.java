package codeForces;

import java.util.*;
import java.util.Map.Entry;

public class Rgh {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();

		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			
			int ans=0;
			Map<Integer,Integer> map = new HashMap<>();
			Map<Integer,Integer> prev = new HashMap<>();
			int min=Integer.MAX_VALUE;
			int minNumber=0;
			int count=0;
			
			for(int i=0;i<n;i++) {			
				a[i]= sc.nextInt();
				
				if(!map.containsKey(a[i])) {
					map.put(a[i], 0);
				}
				
				count=map.get(a[i]);
				
				if(!prev.containsKey(a[i])) {
					map.put(a[i],count+i);
				}
				else {
				    map.put(a[i],count+i-prev.get(a[i]));
				}
				prev.put(a[i],i);
			}
			
			for(Entry<Integer,Integer> e : map.entrySet()) {
				if(e.getValue()<min) {
					min=e.getValue();
					minNumber=e.getKey();
				}
			}
			
			ArrayList<Integer> al = new ArrayList<>();
			int temp =1;
			
			for(int i=0;i<n;i++) {
				if(a[i]==minNumber) {
					al.add(i);
				}
			}
			
			
			for(int e: al) {
				if(e-temp>1) {
					ans++;
				}
				temp=e;
			}
			if(temp!=n-1) ans++;
			
			System.out.println(ans);
			
		}

	}

}
