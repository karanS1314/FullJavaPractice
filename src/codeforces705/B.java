package codeforces705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

	public static void main(String[] args) {
		SScanner sc = new SScanner ();
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			ArrayList<Integer> al = new ArrayList<>();
			int half=k/2;
			
			if((k&1)!=0) {
				for(int i=half+1;i<k && i<n;i++) {
					al.add(i);
				}
			}
			
			else {
				for(int i=half;i<k && i<=n;i++) {
					al.add(i);
				}
			}
			
			for(int i=k+1;i<=n;i++) {
				al.add(i);
			}
			
			System.out.println(al.size()+ " ");
			if(al.size()!=0) {
				for(int x:al) {
					System.out.print(x+ " ");
				}
			}
			
			System.out.println();
		}

	}

}
