package codeForces.div2_706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B {
	
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
	static void  sort(int a[]) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<a.length;i++) al.add(a[i]);
		
		Collections.sort(al);
		for(int i=0;i<a.length;i++)a[i]=al.get(i);
	}
	public static void main(String[] args) {
		SScanner sc = new SScanner ();
		int t = sc.nextInt();
		while(t-->0) {
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		int b [] = new int [n];
//
//		
//		for(int i=n-1;i>=0;i--) {
//			if(a[i]>0) {
//			int max = Math.max(0, i-a[i]+1);
//			for(int j=max;j<=i;j++) {
//				b[j]=1;
//			}
////			i=;
//			if(max==0) break;
//			}
//		}
		int sum [] = new int[n];
//		if(n==1) { if(a[0]>0) b[0]=1;
//		else b[0]=0;
//		}
//		else {
			
			if(a[n-1]>0) {sum[n-1]=a[n-1];
			b[n-1]=1;
			}
		for(int i=n-2;i>=0;i--) {
			sum[i]=Math.max(a[i], sum[i+1]-1);
			if(sum[i]>0) b[i]=1;
		}

//		for(int e : sum) System.out.print( e + " ");
//		System.out.println();
		for(int e : b) System.out.print( e + " ");
		
		System.out.println(); 
		}
	}
}

