package gfgHash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DistinctElementsWindow {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int count=0;
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<k;i++) {
		    	if(!map.containsKey(a[i])) {
		    		map.put(a[i], 0);
		    	}
		    	count=map.get(a[i]);
		    	count++;
		    	map.put(a[i], count);
		    }
		    for(Entry<Integer,Integer> e: map.entrySet()) {
		    	
		    }
		    System.out.print(map.size()+ " ");
			for(int i=k;i<n;i++) {
				if(map.get(a[i-k])==1) {
					map.remove(a[i-k]);
				}
				else {
					count=map.get(a[i-k]);
					count--;
					map.put(a[i-k], count);
				}
				if(!map.containsKey(a[i])) {
		    		map.put(a[i], 0);
		    	}
				if(i<n-1) {
		    	count=map.get(a[i]);
		    	count++;
		    	map.put(a[i], count);
				}
		    	System.out.print(map.values().size()+ " ");
			}
			System.out.println();
		}
	}

}
