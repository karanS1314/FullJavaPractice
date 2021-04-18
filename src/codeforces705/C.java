package codeforces705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
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
	static long gcd(long a, long b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a)%1000000007; 
    } 
  
    static long findGCD(long arr[], int n) 
    { 
        long result = 0; 
        for (long element: arr){ 
            result = gcd(result, element); 
  
            if(result == 1) 
            { 
               return 1; 
            } 
        } 
  
        return result%1000000007; 
    } 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q= sc.nextInt();
		long a[] = new long[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		
		while(q-->0) {
			int f=sc.nextInt();
			int s= sc.nextInt();
			
			a[f-1]*=s;
			a[f-1]%=1000000007;
			
			System.out.println(findGCD(a,n));
		}

	}

}
