package codeChef;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	static int tryCount(int n, ArrayList<Integer> al) {
		int count =0;

		
		if(al.get(0)>0) count++;
		if(al.get(al.size()-1)<n-1) count++;
		
		for(int i=1;i<al.size();i++) {
			if(al.get(i)-al.get(i-1)>1) count++;
		}

		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			for(int i=0;i<n;i++) a[i]--;
			
			ArrayList<Integer> aa[] = new ArrayList[n];
			for(int i=0;i<n;i++) aa[i]=new ArrayList<>();
			for(int i=0;i<n;i++) {
				aa[a[i]].add(i);
			}
			
			int best=Integer.MAX_VALUE;
			
			for(ArrayList<Integer> al: aa) {
				if(al.size()>0) {
					best=Math.min(best, tryCount(n,al));
				}
			}
			
			System.out.println(best);
			
			
		}

	}

}
