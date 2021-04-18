package gfgHash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			Set<Integer> set=new HashSet<>();
			for(int i=0;i<n;i++) {
				set.add(sc.nextInt());
			}
			Set<Integer> set2=new HashSet<>();
			for(int i=0;i<m;i++) {
				set2.add(sc.nextInt());
			}
			
			 set.retainAll(set2);
			 System.out.println(set.size());
			
		}
	}

}
