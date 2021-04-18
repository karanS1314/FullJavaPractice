package gfgHash;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LongestSubarrayOf0And1s {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
//			O(n)
			int sum=0;
			for(int i=0;i<n;i++) {
				if(a[i]==0) {
					a[i]=-1;
				}
				sum+=a[i];
				a[i]=sum;
			}
			
			Map<Integer,ArrayList<Integer>> mp=new HashMap<>();
			for(int i=0;i<n;i++) {
				if(!mp.containsKey(a[i])) {
					mp.put(a[i], new ArrayList<>());
					if(a[i]==0) {
						mp.get(a[i]).add(-1);
					}
				}
				mp.get(a[i]).add(i);
			}
			
			int res=0;
			for(int i=0;i<n;i++) {
				int m=mp.get(a[i]).get(mp.get(a[i]).size()-1)-mp.get(a[i]).get(0);
				res=Math.max(res, m);
			}
			System.out.println(res);
			
		}

	}

}
