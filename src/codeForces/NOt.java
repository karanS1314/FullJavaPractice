package codeForces;

import java.util.*;

public class NOt {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=0;
		if(sc.hasNext())t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String a = sc.nextLine();
			String b = sc.nextLine();
			
			int n = a.length();
			
			int ar[] = new int[n];
			Set<Integer> set = new HashSet<>();
			for(int i=0;i<n;i++) {
				if(a.charAt(i)!=b.charAt(i)) {
					ar[i]++;
					set.add(i);
				}
			}
			
			int ans=0;
			for(int i=0;i<n;i+=2) {
				if(ar[i]!=0) {
					if(!set.contains(i+2)) {
						ans+=1;
					}
				}
			}
			for(int i=1;i<n;i+=2) {
				if(ar[i]!=0) {
					if(!set.contains(i+2)) {
						ans+=1;
					}
				}
			}
			
			System.out.println(ans);
			
		
		}

	}

}
