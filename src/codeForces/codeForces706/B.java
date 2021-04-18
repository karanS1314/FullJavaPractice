package codeForces.codeForces706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			HashSet<Integer> set = new HashSet<>();
			ArrayList<Integer> ax = new ArrayList<>();
			
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				int f = sc.nextInt();
				ax.add(f);
				set.add(f);
				if(f>max) max=f;
			}
			
			int mx = 0;
			for(int i=0;i<100001;i++) {
				if(!set.contains(i)) {
					mx=i;
					break;
				}
			}
			while(k-->0) {
				if(mx>max) {
					break;
				}
				int x = (max+mx)/2;
				if(((mx+max)&1)==1) x++;
				
				if(set.contains(x)) break;
//				System.out.println(mex + " " + max + " "+ x);
				
				set.add(x);
				
				if(x>max) max=x;
				if(mx==0) continue;
				if(x==mx) {
					if(mx>max) {
						x++;
					}
					else {
						for(int i=mx+1;i<=max+1;i++) {
							if(!set.contains(i)) {
								mx=i;
								break;
							}
						}
					}
				}
//				System.out.println(mex + " " + max + " "+ x);

				
				

//				for(int p : al) System.out.print(p + " ");
				
			}
			int ans=set.size();
			if(mx>max) ans+=k+1;
			System.out.println(ans);
			
		}
		

	}

}
