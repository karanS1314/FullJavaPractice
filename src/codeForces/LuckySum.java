package codeForces;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class FastScanner {
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


public class LuckySum {
	

	static boolean isLucky(int n) {
		int i=0;
		boolean yes=true;
		while(i<Math.log(n)+1) {
			if()
		}
	}

	public static void main(String[] args) {
		
		FastScanner fs = new FastScanner();
		int l = fs.nextInt();
		int r = fs.nextInt();
		
		boolean is= false;
		int cnt=0;
		ArrayList<Integer> al = new ArrayList<>();
		
		while(cnt==0) {
			
		}
		

	}

}
