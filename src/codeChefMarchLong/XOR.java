package codeChefMarchLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class XOR {
	static class SScanner {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t =0;
		if(sc.hasNext())t=sc.nextInt();
		int a[] = new int[31];
		a[0]=1;
		for(int i=1;i<=30;i++) {
			a[i]=a[i-1]*2;
		}
		
		while(t-->0) {
			int n = 0;
			if(sc.hasNext())n=sc.nextInt();
			int str=-1;
			
			for(int i=0;i<31;i++) {
				if(n<a[i]) {
					str=a[i];
					break;
				}
			}
			
			long c1=str/2;
			long c2=str/2-1;
			
			
			long d1=c1^n;
			long d2=c2^n;
			
			System.out.println(Math.max(d1*c1, d2*c2));
//			int mx=0;
//			int stri=-1;
//			
//			for(int i=c1+1;i<str;i++) {
//				if((c1^i)==n) {
//					mx=c1*i;
//					stri=i;
//					break;
//				}
//			}
//			for(int i=stri+1;i<str;i++) {
//				if((c2^i)==n) {
//					mx=Math.max(mx, c2*i);
//					break;
//				}
//			}
//			System.out.println(mx);
			
		}

	}

}
