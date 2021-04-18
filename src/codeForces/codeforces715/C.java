
 //   * * * fuck you * * *   //
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.util.*;
  
 
 public class C {
     public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long d = 0;
        long x = 0;
        Collections.sort(al);
        ArrayList<Integer> ral = new ArrayList<>();
        for(int i=0;i<n;i++){
            ral.add(al.get(n-i-1));
        }
        long rd = 0;
        long y = 0;
        for(int i=0;i<n;i++){
            max = Math.max(al.get(i), max);
            min = Math.min(al.get(i), min);
            d+=max - min;
        }

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(ral.get(i), max);
            min = Math.min(ral.get(i), min);
            rd+=max - min;
        }

        int rem = al.get(0);
        al.remove(0);
        al.add(rem);
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(al.get(i), max);
            min = Math.min(al.get(i), min);
            x+=max - min;
        }

        int remr = al.get(0);
        al.remove(0);
        al.add(remr);
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(ral.get(i), max);
            min = Math.min(ral.get(i), min);
            y+=max - min;
        }
        while(x<d ){
            d=x;
            int re = al.get(0);
            al.remove(0);
            al.add(re);
            int mi = Integer.MAX_VALUE;
            int mx = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                mx = Math.max(al.get(i), mx);
                mi = Math.min(al.get(i), mi);
                x+=mx - mi;
            }
        }
        while(y<rd ){
            rd=y;
            int re = ral.get(0);
            ral.remove(0);
            ral.add(re);
            int mi = Integer.MAX_VALUE;
            int mx = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                mx = Math.max(ral.get(i), mx);
                mi = Math.min(ral.get(i), mi);
                y+=mx - mi;
            }
        }
        // Arrays.sort(a); 
        // for(int e : a)System.out.print(e+ " ");
        System.out.println(Math.min(d , rd));
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
 