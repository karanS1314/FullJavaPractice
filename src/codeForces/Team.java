package codeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Team {
	static class Scanner {

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
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		
		int a[][] = new int[n][3];
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			int sm=0;
			for(int j=0;j<3;j++) {
				sm+=a[i][j];
			}
			if(sm>=2) cnt++;
		}
		
		System.out.println(cnt);
	}

}
