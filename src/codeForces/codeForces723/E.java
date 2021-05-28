package codeForces.codeForces723;

//   * * * the goal is to be worlds best * * *   //
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 

public class E {
    static class Pair implements Comparable<Pair>{
        long a;
        long b;

        Pair(long a , long b){
            this.a = a;
            this.b = b;
        }
        public int compareTo(Pair o){
            return 1;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int t = 1;
        while(t-->0){
            int n = sc.nextInt();
            long a[] = new long[n + 1];
            for(int i = 1; i < n + 1; i++){
                a[i] = sc.nextLong();
            }
            int x = 0;
            ArrayList<Integer> neg = new ArrayList<>();
            for(int i = 1; i <= n; i++){
                if(a[i] >= 0){
                    x++;
                }
                else{
                    neg.add(i);
                }
            }
            if(x == n){
                System.out.println(x);
            }
            else{
                Pair dp[][] = new Pair[neg.size() + 1][n + 1];
                for(int i = 1; i <= neg.size(); i++){
                    dp[i][0] = new Pair(0L , 0L);
                }
                int k = neg.size();
                for(int i = 1; i <= neg.size(); i++){
                    for(int j = 1; j <= n; j++){
                        if(j < neg.get(i - 1)){
                            if(a[j] >= 0){
                                dp[i][j] = new Pair(dp[i][j - 1].a + a[j] , dp[i][j - 1].b + 1);
                            }
                            else{
                                dp[i][j] = new Pair(dp[i][j - 1].a , dp[i][j - 1].b);
                            }
                        }
                        else{
                            dp[i][j] = new Pair(dp[i][j - 1].a + a[j] , dp[i][j - 1].b + 1);
                        }
                    }
                }
                  for(int i = 1; i <= k ; i++){
                for(int j = 1; j <= n; j++){
                    System.out.print(dp[i][j].a + "-" + dp[i][j].b + "  ");
                }
                System.out.println();
            }
                long mx = x;
                for(int i = 1; i <= k; i++){
                    for(int j = 1; j <= n; j++){
                        if(dp[i][j].a >= 0){
                            mx = Math.max(dp[i][j].b , mx);
                        }
                    }
                }
    
                System.out.println(mx);
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
    static final int max_val = 2147483647;
    static final int min_val = max_val + 1;
    
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

    static int nCr(int n, int r)
    {
           return fact(n) / (fact(r) *
                fact(n - r));
    }
    
    // Returns factorial of n
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
     
    // to generate the lps array
    // lps means longest preffix that is also a suffix
    static void generateLPS(int lps[] , String p){
        int l = 0;
        int r = 1;
   
        while(l < p.length() && l < r && r < p.length()){
            if(p.charAt(l) == p.charAt(r)){
                lps[r] = l + 1;
                l++;
                r++;
            }
            else{
                if(l > 0)
                    l = lps[l - 1];
                else
                    r++;    
            }
        }
    }
     

    //count sort --> it runs in O(n) time but compromises in space
    static ArrayList<Integer> countSort(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max = Math.max(max , a[i]);
        }

        int posfre[] = new int[max+1];
        boolean negPres = false;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                posfre[a[i]]++;
            }
            else{
                negPres = true;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        if(negPres){
            int min = Integer.MAX_VALUE;
            for(int i=0;i<a.length;i++){
                min = Math.min(min , a[i]);
            }

            int negfre[] = new int[-1*min+1];
            for(int i=0;i<a.length;i++){
                if(a[i]<0){
                    negfre[-1*a[i]]++;
                }
            }

            for(int i=min;i<0;i++){
                for(int j=0;j<negfre[-1*i];j++){
                    res.add(i);
                }
            }
            for(int i=0;i<=max;i++){
                for(int j=0;j<posfre[i];j++){
                    res.add(i);
                }
            }
            return res;
        }
        for(int i=0;i<=max;i++){
            for(int j=0;j<posfre[i];j++){
                res.add(i);
            }
        }
        return res;
    }

    // returns the index of the element which is just smaller than or
    // equal to the tar in the given arraylist 
    static int lowBound(ArrayList<Integer> ll,long tar ,int l,int r){
        if(l>r) return l;

        int mid=l+(r-l)/2;

        if(ll.get(mid)>=tar){
            return lowBound(ll,tar,l,mid-1);
        }

        return lowBound(ll,tar,mid+1,r);
    }

    // returns the index of the element which is just greater than or
    // equal to the tar in the given arraylist 
    static int upBound(ArrayList<Integer> ll,long tar,int l ,int r){
        if(l>r) return l;

        int mid=l+(r-l)/2;

        if(ll.get(mid)<=tar){
            return upBound(ll,tar,l,mid-1);
        }

        return upBound(ll,tar,mid+1 ,r);
    }

    static void swap(int i , int j , int a[]){
        int x = a[i];
        int y = a[j];
        a[j] = x;
        a[i] = y;
    }
    // a -> z == 97 -> 122

    // String.format("%.9f", ans) ,--> to get upto 9 decimal places , (ans is double)
    
    // write 
}
