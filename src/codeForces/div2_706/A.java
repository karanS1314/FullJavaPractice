package codeForces.div2_706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class A {
	
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
			int b[] = new int[n];
			int tm[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				tm[i]=sc.nextInt();
			}

			long ans =0;
			for(int i=0;i<n;i++) {
				ans+=tm[i];
				
				if(i>0) {
					ans+=a[i]-b[i-1];
				}
				else { 
					ans+=a[i];
				}

				
				
				if(i!=n-1) {
					if(ans>b[i]) {
						ans+=1;
					}
					else {
						ans=b[i];
					}
				}	
			}
			System.out.println(ans);
		}
	}

}
