package gfgBacktracking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class CombinationSum {
	static void combinationSum(int a[],int sum,ArrayList<Integer> al,int i) {
		if( sum<0) {
			return;
		}
		if(sum==0) {
			System.out.print("(");
			if(al.size()>0) {
			for(int k=0;k<al.size()-1;k++) {
				System.out.print(al.get(k)+" ");
			}
			System.out.print(al.get(al.size()-1));
			}
			System.out.print(")");
		}
		
		while(i<a.length && sum-a[i]>=0) {
		al.add(a[i]);
		
		combinationSum(a, sum-a[i], al,i);
		i++;
		
		al.remove(al.size()-1);
		
		}
		
		
		return;
		
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
			int b=sc.nextInt();
			TreeSet<Integer> set=new TreeSet<>();
			for(int i=0;i<n;i++) {
				set.add(a[i]);
			}
			
			int a1[]=new int[set.size()];
			int i=0;
			while(!set.isEmpty()) {
				int m=set.pollFirst();
				a1[i]=m;
				i++;
			}
	
			ArrayList<Integer> al=new ArrayList<>();
			combinationSum(a1, b,  al,0);
	
				
			System.out.println();
			}
		}

	}


