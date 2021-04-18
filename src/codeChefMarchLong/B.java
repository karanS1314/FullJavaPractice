package codeChefMarchLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class SScanner {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer("");
	public String next() {
		while (!st.hasMoreElements())
			try {
				st=new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		return st.nextToken();
	}
	int nextInt() {
		return Integer.parseInt(next());
	}
}




public class B {
	
	int minCost(int a , int b , int c , int dp[][][] , int n , int e , int h) {
		if(n==0) return 0;
		
		int a1,b1,c1=-2;
		if(e>=2) {
			a1= minCost(a,b,c,dp,n-1,e-2,h);
		}
		if(h>=3) {
			b1= minCost(a,b,c,dp,n-1,e,h-3);
		}
		if(e>=1 && h>=1) {
			c1= minCost(a,b,c,dp,n-1,e-1,h-1);
		}
		
		
		
	}

	public static void main(String[] args) {
		SScanner sc = new SScanner();
		int t = sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			
			int e=sc.nextInt();
			int h=sc.nextInt();
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			int dp[][][]= new int[n][e][h];
			
			
			
			
			
		}

	}

}
