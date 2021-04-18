package codeChefMarchLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 

public class CollegeLife4 {
    //Good morning!
	static long res(long n , long e ,long h ,long a , long b , long c){
		if(n<=0) return 0;

		long ans = ll;

		if((n<=e) &&(n<=h)){
			ans = minv(ans , n*c);
		}
		if(3*n <=h){
			ans = minv(ans , n*b);
		}
		if(2*n <=e){
			ans = minv(ans , n*a);
		}
		if(((h-n)/2>=1) && ((h-n)/2 >=n-e)){
			if(b-c<0){
				long temp = minv(n-1,(h-n)/2);
				ans = minv(ans, (b-c)*temp +n*c);
			}
			else{
				long temp = maxv(1,n-e);
				ans = minv(ans , (b-c)*temp + n*c);
			}
		}
		if((e-n)>=1 && (e-n)>=n-h){
			if(a-c<0){
				long temp = minv(n-1,e-n);
				ans = minv(ans , (a-c)*temp + n*c);
			}
			else{
				long temp = maxv(1, n-h);
				ans = minv(ans,(a-c)*temp+n*c);
			}
		}
		if((e/2>=1) && (e/2 >=(3*n - h + 2)/3)){
			if(a-b<0){
				long temp = minv(n-1,e/2);
				ans = minv(ans , (a-b)*temp + n*b);
			}
			else{
				long temp = maxv(1, (3*n - h + 2)/3);
				ans = minv(ans , (a-b)*temp + n*b);
			}
		}

		if((e>=3) && (h>=4) && (n>=3)){
			ans = minv(ans , a+b+c + res(n-3,e-3,h-4,a,b,c));
		}
		return ans;

	}
	static long maxv(long a , long b){
		if(a>b) return a ;
		return b;
	}
	static long minv(long a , long b){
		if(a<b) return a;
		return b;
	}

	
	public static void main(String[] args) {
		try{
			FastScanner sc = new FastScanner();
			long t = sc.nextLong();
			while(t-->0){
				long n = sc.nextLong();
				long e = sc.nextLong();
				long h = sc.nextLong();
				long a = sc.nextLong();
				long b = sc.nextLong();
				long c = sc.nextLong();
				long ans;
				ans = res(n , e , h , a , b , c);

				if(ans == ll){
					System.out.println(-1);
				}
				else{
					System.out.println(ans);
				}
			}
		} catch(Exception e){
			return;
		}
	}




 
	// Use this instead of Arrays.sort() on an array of ints. Arrays.sort() is n^2
	// worst case since it uses a version of quicksort. Although this would never
	// actually show up in the real world, in codeforces, people can hack, so
	// this is needed.
	static void ruffleSort(int[] a) {
		//ruffle
		int n=a.length;
		Random r=new Random();
		for (int i=0; i<a.length; i++) {
			int oi=r.nextInt(n), temp=a[i];
			a[i]=a[oi];
			a[oi]=temp;
		}
		
		//then sort
		Arrays.sort(a);
	}
	
	// Use this to input code since it is faster than a Scanner
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
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

		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		String str = "";
 
		String nextLine() {
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
 
		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
    // use this to find the index of any element in the array +1 /// 
	// returns an array that corresponds to the index of the i+1th in the array a[]
	// runs only for array containing different values enclosed btw 0 to n-1
	static int[] indexOf(int[] a) {
		int[] toRet=new int[a.length];
		for (int i=0; i<a.length; i++) {
			toRet[a[i]]=i+1;
		}
		return toRet;
	}

	static int gcd(int a, int b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}

	//generates all the prime numbers upto n
	static void sieveOfEratosthenes(int n , ArrayList<Integer> al)
    {

        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int p = 2; p * p <= n; p++) 
        {

            if (prime[p] == true) 
            {

                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        for (int i = 2; i <= n; i++)
        {
            if (prime[i] == true)
                al.get(i);
        }
    }
	static final int mod=100000000 + 7;
	static final String sl = "1000000000000000";
	static final long ll = Long.parseLong(sl);
	//fastPow
	static long fastPow(long base, long exp) {
		if (exp==0) return 1;
		long half=fastPow(base, exp/2);
		if (exp%2==0) return mul(half, half);
		return mul(half, mul(half, base));
	}

	//multiply two long numbers
	static long mul(long a, long b) {
		return a*b%mod;
	}

	// write 

}
