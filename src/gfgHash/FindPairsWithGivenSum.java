package gfgHash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindPairsWithGivenSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int x=sc.nextInt();
			int a[]=new int[n];
			Set<Integer> b=new HashSet<>();
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
		
			for(int i=0;i<m;i++) {
				b.add(sc.nextInt());
			}
			
			Arrays.sort(a);
			int count=0;
			StringBuffer ans=new StringBuffer("");
			for(int i=0;i<n;i++) {
				if(b.contains(x-a[i]) && count==0) {
					ans=ans.append(a[i]+ " " +(x-a[i]));
					count=1;
				}
				else if(b.contains(x-a[i])&& count==1) {
					ans=ans.append(", "+a[i]+ " " +(x-a[i]));
				}
			}
			if(count==0) {
				System.out.println(-1);
			}
			else {
				System.out.println(ans);
			}
		}

	}

}
