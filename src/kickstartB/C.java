package kickstartB;


//   * * * fuck you * * *   //
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class C {
	static class Edge{
		int src;
		int dest;
		int limit;
		long fine;
		
		Edge(int i , int j , int limit , long fine){
			src=i;
			dest=j;
			this.limit = limit;
			this.fine = fine;
		}
	}
	static class Pair{
		int v;
		String psf;
		
		Pair(int v , String psf ){
			this.v = v;
			this.psf = psf;
		}
	}
	static Long gcd(ArrayList<Long> f)
    {

        Long result = 0L;
        for (Long element: f){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1L;
            }
        }
 
        return result;
    }
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int t = sc.nextInt();
		int tc  = 0;
		while(t-->0) {
			tc++;
			int n = sc.nextInt();
			int q = sc.nextInt();
			ArrayList<Edge>[] graph = new ArrayList[n+1];
			for(int i=1;i<=n;i++) {
				graph[i] = new ArrayList<>();
			}

			for(int i=0; i<n-1; i++) {
				int src = sc.nextInt();
				int dest = sc.nextInt();
				int limit = sc.nextInt();
				long fine = sc.nextInt();
				graph[src].add(new Edge(src, dest, limit , fine));
				graph[dest].add(new Edge(dest, src, limit , fine));
			}

			int strt = 1;
			Queue<Pair> pq = new LinkedList<>();
			boolean vis[] = new boolean[n+1];
			pq.add(new Pair(strt , strt + ""));

			String paths[] = new String[n+1];
				
			while(pq.size()>0) {
				Pair curr = pq.poll();
					
				if(vis[curr.v]==true) {
					continue;
				} 
				vis[curr.v] = true;

				paths[curr.v] = curr.psf; 
					
				for(Edge e : graph[curr.v]) {
					if(!vis[e.dest]) {
						pq.add(new Pair(e.dest , curr.psf + e.dest));
					}
				}
			}
			ArrayList<Long> res = new ArrayList<>();
			while(q-->0){
				int c = sc.nextInt();
				int w = sc.nextInt();

				String path = paths[c];
				char ca[] = path.toCharArray();
				
				int N = path.length();

				ArrayList<Long> fineAl = new ArrayList<>();
				for(int i=1;i<N;i++){
					int a = Character.getNumericValue(ca[i]);
					int b = Character.getNumericValue(ca[i-1]);
					for(Edge e : graph[a]){
						if(e.dest == b){
							int limit = e.limit;
							long fine = e.fine;

							if(w>=limit){
								fineAl.add(fine);
							}
							break;
						}
					}
				}

				//gcd of fineAl;
				res.add(gcd(fineAl));

			}
			System.out.print("Case #"+ tc+ ": ");
			for(Long e : res){
				System.out.print(e + " ");
			}
			System.out.println();
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

	static Long gcd(Long a, Long b) {
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

