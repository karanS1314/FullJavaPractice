package gfgBacktracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Subsets {
	static Set<ArrayList<Integer>> set=new HashSet<>();
	static void printSub(int a[],int n,int j,ArrayList<Integer> buf) {
		if(j>n) {
			return;
		}
		if(!set.contains(buf)) {
				System.out.print("(");
				if(buf.size()>0) {
				for(int k=0;k<buf.size()-1;k++) {
					System.out.print(buf.get(k)+" ");
				}
				System.out.print(buf.get(buf.size()-1));
				}
				System.out.print(")");
			}
			set.add(buf);
		
		
		for(int i=j;i<n;i++) {
			buf.add(a[i]);
			printSub(a, n, i+1, buf);
		
			buf.remove(buf.size()-1);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
		
			ArrayList<Integer> buf =new ArrayList<>();	 
			 printSub(a, n, 0, buf);
			 set.clear();
			 System.out.println();
			
		}
		
	}

}
