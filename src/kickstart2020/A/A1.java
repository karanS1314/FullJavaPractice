package kickstart2020.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A1 {
	
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
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int T=t;
		while(t-->0) {
			int n = sc.nextInt();
			int b = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)a[i]=sc.nextInt();
			
			Arrays.sort(a);
			
			int cnt=0;
			int sum=0;
			for(int i=0;i<n;i++) {
				sum+=a[i];
				if(sum<=b) {
					cnt++;
				}
				else {
					break;
				}
			}
			int x=T-t;
			System.out.println("Case #"+x+": " +cnt);
			
		}

	}

}
