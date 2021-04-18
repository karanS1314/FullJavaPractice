package gfgHash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			Set<Integer> ans= new HashSet<>();
			for(int i=0;i<n;i++) {
				ans.add(sc.nextInt());
			}
			for(int i=0;i<m;i++) {
				ans.add(sc.nextInt());
			}
			
			System.out.println(ans.size());
		}

	}

}
