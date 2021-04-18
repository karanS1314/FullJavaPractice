package codeForces.codeForces706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
	static void sort(int a[]) {

		ArrayList<Integer> al = new ArrayList<>();
		for(int e :a) {
			al.add(e);
		}
		Collections.sort(al);
		int i=0;
		for(int e:al) {
			a[i++]=e;
		}
	}
	public static void main(String[] args) {
		SScanner sc = new SScanner();
		int test = sc.nextInt();
		while(test-->0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			
			String str = sc.next();
			if(x==0) {
				System.out.println("YES");
			}
			else {
				int c=0;
				for(int i=0;i<n/2;i++) {
					if(str.charAt(i)==str.charAt(n-i-1)) {
						c++;
					}
					else {
						break;
					}
				}

				
				if(c>x) {
					System.out.println("YES");
				}
				else if(c==x && (n&1)==1) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}

}
