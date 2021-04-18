package codeChef;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Scalar {
	static long power(int a, int b) {
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return power(a,b/2)*power(a,b/2);
		}
		return a*power(a,b-1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n =0;
		if(sc.hasNext())n =sc.nextInt();
		int q =0;
		if(sc.hasNext())q =sc.nextInt();
		long m = power(2,32);
		
		long a[] = new long[n+1]; 
		int parent[] = new int[n+1];
		parent[1]=-1;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		for(int i=0;i<n-1;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			parent[v]=u;
		}
		
		
		while(q-->0) {
			long ans =0;
			
			int u =0;
			if(sc.hasNext())u =sc.nextInt();
			int v =0;
			if(sc.hasNext())v =sc.nextInt();
			
			ans+=a[u-1]*a[v-1];
		
			while(u!=-1) {
				u=parent[u];
				v=parent[v];
				if(u==-1)break;
				ans+=(a[u-1]*a[v-1])%m;
			}
			
			System.out.println(ans%m);
		}
		

	}

}
