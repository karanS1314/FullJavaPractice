
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

 

public class A {
    //Good morning!
    static int num(int a , int b){
        // int min = Math.min(a , b);
        // int mx = Math.max(a , b);
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=4;i<=mx;i+=2){
        //     set.add(i);
        // }
        // int cnt =0;
        // for(int i=2;i<=mx/2 && i<=min;i++){
        //     if(set.contains(2*i)){
        //          cnt++;
        //          if(i<=min/2) cnt++;
        //     }
        // }
        int cnt = Math.min(b/2-1, a-1);
        cnt += Math.min(b-1 , a/2-1);
        return cnt;
    }
    public static void main(String[] args) {
		FastScanner sc = new FastScanner();
        int t = sc.nextInt();
		int tc =0;
		while(t-->0){
			tc++;
			int r = sc.nextInt();
			int c = sc.nextInt();

			int a[][] = new int[r][c];
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					a[i][j]=sc.nextInt();
				}
			}
            int p[][] = new int[r][c];
            for(int j=0;j<c;j++){
                p[0][j]=a[0][j];
            }
            for(int i=1;i<r;i++){
                for(int j=0;j<c;j++){
                    if(a[i][j]==1){
                        p[i][j]=p[i-1][j]+1;
                    }
                    else{
                        p[i][j]=0;
                    }
                }
            }

            int q[][] = new int[r][c];
            for(int j=0;j<c;j++){
                q[r-1][j]=a[r-1][j];
            }
            for(int i=r-2;i>=0;i--){
                for(int j=0;j<c;j++){
                    if(a[i][j]==1){
                        q[i][j]=q[i+1][j]+1;
                    }
                    else{
                        q[i][j]=0;
                    }
                }
            }

            int l[][] = new int[r][c];
            for(int i=0;i<r;i++){
                l[i][0]=a[i][0];
            }
            for(int j=1;j<c;j++){
                for(int i=0;i<r;i++){
                    if(a[i][j]==1){
                        l[i][j]=l[i][j-1]+1;
                    }
                    else{
                        l[i][j]=0;
                    }
                }
            }

            int m[][] = new int[r][c];
            for(int i=0;i<r;i++){
                m[i][c-1]=a[i][c-1];
            }
            for(int j=c-2;j>=0;j--){
                for(int i=0;i<r;i++){
                    if(a[i][j]==1){
                        m[i][j]=m[i][j+1]+1;
                    }
                    else{
                        m[i][j]=0;
                    }
                }
            }

            // for(int i=0;i<r;i++){
            //     for(int j=0;j<c;j++){
            //         System.out.print(m[i][j]+ " ");
            //     }
            //     System.out.println();
            // }
          int res=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(p[i][j]>=2&&l[i][j]>=2){
                        res+=num(p[i][j], l[i][j]);
                        // System.out.println("num ="+num(p[i][j], l[i][j])+" i and j= "+ i + j);
                    }
                    if(p[i][j]>=2&&m[i][j]>=2){
                        res+=num(p[i][j], m[i][j]);
                        // System.out.println("num ="+num(p[i][j], m[i][j])+" i and j= "+ i +" "+ j);
                    }
                    if(q[i][j]>=2&&l[i][j]>=2){
                        res+=num(q[i][j], l[i][j]);
                        // System.out.println("num ="+num(q[i][j], l[i][j])+" i and j= "+ i + j);
                    }
                    if(q[i][j]>=2&&m[i][j]>=2){
                        res+=num(q[i][j], m[i][j]);
                        // System.out.println("num ="+num(q[i][j], m[i][j])+" i and j= "+ i + j);
                    }
                }
            }




			
			System.out.println("Case #"+ tc+ ": "+ res );

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
