package codeForces.codeforces_709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 

public class D {
    //Good morning!
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = sc.readArray(n);

            if(n==1 || n==2) {
                System.out.println(0);
                continue;
            }
            else{
                int m =0;
                int c =0;
                int str=0;
                boolean f =true;
                for(int i=1;i<n-1;i++){
                    // if(a[i-1]==a[i+1] && a[i-1]==0){
                    //     c=a[i];
                    //     mx=2*a[i];
                    //     break;
                    // }
                    // if(Math.abs(a[i]-a[i-1])!= Math.abs(a[i+1]-a[i])){
                    //     mx = Math.abs(a[i]-a[i-1]) + Math.abs(a[i+1]-a[i]);
                    //     break;
                    // }
                    int x = 2*a[i]-a[i-1]-a[i+1];
                    if(x!=0 && str==0){
                        str=x;
                    }
                    else if(x!=0){
                        if(str!=x){
                            if(str<x){
                                int temp=str;
                                int j=1;
                                while(temp<x){
                                    temp*=j;
                                    j++;
                                }
                                if(temp!=x) {
                                    f= false;
                                    break;
                                }
                                else{
                                    m = str;
                                }
                            }
                            if(str>x){
                                int temp=x;
                                int j=1;
                                while(temp<str){
                                    temp*=j;
                                    j++;
                                }
                                if(temp!=str) {
                                    f= false;
                                    break;
                                }
                                else{
                                    m = x;
                                }
                            }

                        }
                    }


                }
                System.out.println(m);
                if(f && a[0]<m){
                    for(int i=1;i<n;i++){
                        if(a[i]-a[i-1]<m && a[i]>=a[i-1]){
                            c=a[i]-a[i-1];
                            break;
                        }
                    }
                    System.out.println(m + " " + c);
                }
                else{
                    System.out.println(-1);
                }
            }
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

	//swap in any kind of generic array
	static <E> void swap(int i  , int j , E []a){
		E x = a[i];
		E y = a[j];
		a[i]=x;
		a[j]=y;
	}

	// write 

}

