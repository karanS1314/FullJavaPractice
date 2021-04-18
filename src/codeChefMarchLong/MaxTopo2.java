package codeChefMarchLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 

public class MaxTopo2{
    //Good morning!
    static class Pair{
        int x;
        int y;
        Pair(int x , int y){
            this.x=x;
            this.y=y;
        }
    }
    static class PoP{
        int x;
        Pair y;
        PoP(int x , Pair y){
            this.x = x;
            this.y =y;
        }
    }
    static int n;
    static final int N = 5*100000 +5;
    static int factorialNumInverse[]= new int[N+1];
    static int naturalNumInverse[] = new int[N+1];
    static int fact[] = new int[N+1];
    static void InverseofNumber(int p){
        naturalNumInverse[0]=naturalNumInverse[1]=1;
        for(int i=2;i<=N;i++){
            naturalNumInverse[i]=naturalNumInverse[p%i]*(p-p/i)%p;
        }
    }

    static void InverseofFactorial(int p){
        factorialNumInverse[0]=factorialNumInverse[1]=1;
        for(int i=2;i<=N;i++){
            factorialNumInverse[i]=(naturalNumInverse[i]*factorialNumInverse[i-1])%p;
        }
    }

    static void factorial(int p){
        fact[0]=1;
        for(int i=1;i<=N;i++){
            fact[i]=(fact[i-1]*i)%p;
        }
    }

    static int Binomial(int N , int R , int p){
        if(R>N) return 0;
        if(R==N) return 1;
        int ans =((fact[N] = factorialNumInverse[R])%p* factorialNumInverse[N-R])%p;
        return ans;
    }

    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    static ArrayList<Integer> vis = new ArrayList<>();
    static ArrayList<Integer> temp_ways = new ArrayList<>();
    static ArrayList<Integer> sub_tree = new ArrayList<>();

    static int dfs(int node){
        vis.set(node,1);
        int ans=1;
        int subtree=0;
        for(int x : adj.get(node)){
            if(vis.get(x)==0){
                int curr_s = dfs(x);
                subtree =curr_s;
                ans*=Binomial(subtree , curr_s , mod);
                ans%=mod;
                ans*=temp_ways.get(x);
                ans%=mod;
            }
        }
        ans%=mod;
        temp_ways.set(node,ans);
        return subtree+1;
    }
    static ArrayList<PoP> AA;
    static int getNode(int node){
        vis.set(node,1);
        int subtree=0;
        int curr;
        for(int x : adj.get(node)){
           if(vis.get(x)==0){
               curr = getNode(x);
               subtree+=curr;
               int abcd=Math.min(curr, (n-curr));
               AA.add(new PoP(abcd, new Pair(x , node)));
           } 
        }
        sub_tree.set(node, subtree+1);
        return subtree+1;
    }



	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            int m = n-1;
            adj.clear();
            vis.clear();
            temp_ways.clear();

            while(n-->0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                adj.get(x-1).add(y-1);
                adj.get(y-1).add(x-1);
            }
            if(n==1){
                int k1=0;
                int k2=0;
                if(k==1){
                    vis.clear();
                    temp_ways.clear();
                    dfs(k1);
                    System.out.println(k1+1+ " " +temp_ways.get(k1)%mod);
                }
                else{
                    vis.clear();
                    temp_ways.clear();
                    dfs(k2);
                    System.out.println(k2+1+ " " +temp_ways.get(k2)%mod);
                }
            }
            AA.clear();
            sub_tree.clear();
            getNode(0);
            int idx=1;
            Collections.sort(AA);




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
