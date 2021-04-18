package codeForces.codeForces706;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;


public class C {
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
	
    static double roundDouble(double d, int places) {
    	 
        BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
	public static void main(String[] args) {
		SScanner sc = new SScanner();
		int t = sc.nextInt();
		while(t-->0) {
			int N = sc.nextInt();
			int n = 2*N;
			int x[] = new int[n];
			int y[] = new int [n];
			ArrayList<Integer> al = new ArrayList<>();
			ArrayList<Integer> bl = new ArrayList<>();

			for(int i=0;i<n;i++) {
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();	
				if(x[i]==0)al.add(Math.abs(y[i]));
				else {
					bl.add(Math.abs(x[i]));
				}
			}
			Collections.sort(al);
			Collections.sort(bl);

			double ans=0;
			for(int i=0;i<N;i++) {
				double z = Math.sqrt((al.get(i))*(al.get(i)) +(bl.get(i))* (bl.get(i)));

				ans+=z;
			}
			System.out.println(ans);
			
		}
		

	}

}
