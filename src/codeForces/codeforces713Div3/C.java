package codeForces.codeforces713Div3;

//   * * * fuck you * * *   //
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 

public class C {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        while(t-->0){
            int z = sc.nextInt();
            int o = sc.nextInt();
            String s = sc.nextLine();
			char[] ch = s.toCharArray();
            int n = s.length();

			boolean p = true;

			for(int i=0;i<n && p == true;i++){
				if(ch[i]=='0'){
					if(ch[n-i-1]=='?'){
						ch[n-i-1]='0';
					}
					else if(ch[n-i-1]=='1'){
						p=false;
					}		
				}
				if(ch[i]=='1'){
					if(ch[n-i-1]=='?'){
						ch[n-i-1]='1';
					}
					else if(ch[n-i-1]=='0'){
						p=false;
					}
				}
			}
			// if(n%2==1){
			// 	char c = s.charAt(n/2);
			// 	if(c=='?') continue;
			// 	else if(c=='1') 
			// }
			// System.out.println("*** " + s);
			if(p!=true){
				System.out.println(-1);
				continue;
			}

			for(int i=0;i<n;i++){
				char c = ch[i];
				if(c=='0'){
					z--;
				}
				else if(c=='1'){
					o--;
				}
			}
			// System.out.println(z+ " "+ o);
			if(z<0 || o<0){
				p = false;
			}
			else{
				outer :for(int i=0;i<n/2;i++){
					char c = ch[i];
					if(c=='?'){
						if(ch[n-i-1]!='?'){
							p=false;
							break outer;
						}
						if(z>o){
							ch[i]='0';
							ch[n-i-1]='0';
							z-=2;
						}
						else {
							ch[i]='1';
							ch[n-i-1]='1';
							o-=2;
						}
					}
					// System.out.println(s);
				}
				if((n&1)==1){
					if(s.charAt(n/2)=='?'){
						int i =n/2;
						if(z>o){
							ch[i]='0';
							z-=1;
						}
						else {
							ch[i]='1';
							o-=1;
						}
					}
				}
				
			}
			// System.out.println(z+ " "+o);
			if(p==false || z!=0 || o!=0){
				System.out.println(-1);
			}
			else{
				System.out.println(String.valueOf(ch));
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
