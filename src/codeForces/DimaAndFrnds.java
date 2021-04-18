package codeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DimaAndFrnds {
	
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
		SScanner sc = new SScanner();
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		int ans =0;
		
		for(int i=0;i<5;i++) {
			if((sum+i+1)%(n+1)!=1) {
				ans++;
			}
		}
		System.out.println(ans);
		

	}

}
