package kickstart.D;

 
 //   * * * the goal is to be worlds best * * *   //
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.util.*;
  
 
 public class A {
     static class Pair implements Comparable<Pair>{
         int a;
         int b;
 
         Pair(int a , int b){
             this.a = a;
             this.b = b;
         }
 
         public int compareTo(Pair o){
             return this.a - o.a;
         }
     }
 
 //==================================================================================================
 
     public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        int tc = 0;
        while(t-->0){
            tc++;
            int g[][] = new int[3][3];
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(i ==1 && j ==1) continue;
                    g[i][j] = sc.nextInt();
                }
            }

            int count1 = check(g);
            
            int count2 = gen(g);

            int res = count1 + count2;
            System.out.println("Case #"+ tc+ ": "+ res );
        }
     }
     static int gen(int g[][]){
        int max = 0;
        HashMap<Integer , Integer> map = new HashMap<>();

        //row
        if(((g[1][0] - g[1][2]) & 1) != 1){
            map.put(g[1][0] + g[1][2] , map.getOrDefault(g[1][0] + g[1][2] , 0) + 1);
        }

        //col
        if(((g[2][1] - g[0][1]) & 1) != 1){
            map.put(g[2][1] + g[0][1] , map.getOrDefault(g[2][1] + g[0][1] , 0) + 1);
        }

        //right dia
        if(((g[0][2] - g[2][0]) & 1) != 1){
            map.put(g[2][0] + g[0][2] , map.getOrDefault(g[2][0] + g[0][2] , 0) + 1);
        }

        //left dia
        if(((g[2][2] - g[0][0]) & 1) != 1){
            map.put(g[2][2] + g[0][0] , map.getOrDefault(g[2][2] + g[0][0] , 0) + 1);
        }

        for(Map.Entry<Integer , Integer> e : map.entrySet()){
            max = Math.max(max , e.getValue());
        }
        return max;
    }
     static int check(int g[][]){
        int count= 0;
        // top row
        if(g[0][1] - g[0][0] == g[0][2] - g[0][1]) count++;
        // bot row
        if(g[2][1] - g[2][0] == g[2][2] - g[2][1]) count++;
        // right col
        if(g[2][2] - g[1][2] == g[1][2] - g[0][2]) count++;
        // left col
        if(g[2][0] - g[1][0] == g[1][0] - g[0][0]) count++;

        return count;
     }

 
 //==================================================================================================
 
 
     // Use this instead of Arrays.sort() on an array of ints. Arrays.sort() is n^2
     // worst case since it uses a version of quicksort. Although this would never
     // actually show up in the real world, in codeforces, people can hack, so
     // this is needed. 
	 static void sort(int[] arr) {
		 int n = arr.length;
		 ArrayList<Integer> res = new ArrayList<>();
		 for (int a : arr) {
		 	 res.add(a);
		 }
		 Collections.sort(res);
		 for (int i = 0; i < n; i++) {
			 arr[i] = res.get(i);
		 }
	 }
 
	 static void sort(long[] arr) {
		 int n = arr.length;
		 ArrayList<Long> res = new ArrayList<>();
		 for (long a : arr) {
			 res.add(a);
		 }
		 Collections.sort(res);
		 for (int i = 0; i < n; i++) {
			 arr[i] = res.get(i);
		} 
	 }
 
	 static void revSort(int[] arr) {
		 int n = arr.length;
		 ArrayList<Integer> res = new ArrayList<>();
		 for (int a : arr) {
			 res.add(a);
		 }
		 Collections.sort(res, Collections.reverseOrder());
		 for (int i = 0; i < n; i++) {
			 arr[i] = res.get(i);
		 }
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
     
     // print integers in array
     static void print(int a[]){
         for(int e : a){
             System.out.print(e + " ");
         }
         System.out.println();
     }

     static void print(long a[]){
         for(long e : a){
             System.out.print(e + " ");
         }
         System.out.println();
     }

     // generates all the prime numbers upto n
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
                 al.add(i);
         }
     }
     static final int mod = 1000_000_000 + 7;
     static final int imx = Integer.MAX_VALUE;
     static final int imi = Integer.MIN_VALUE;
     
	 static ArrayList<Integer> divisors(int n) {
		 ArrayList<Integer> al = new ArrayList<>();
		 for (int i = 1; i * i <= n; i++) {
			 if (n % i == 0) {
				 if (n == i * i) {
					 al.add(i);
				 } else {
					 al.add(i);
					 al.add(n / i);
				 }
		 	 }
		 }
		 Collections.sort(al);
		 return al;
	 }
 
	 static int countDigits(int n) {
		 int c = 0;
		 while (n != 0) {
			 c++;
			 n /= 10;
		 }
		 return c;
	 }
 
	 static boolean palindrome(String str) {
		 int s = 0;
		 int e = str.length() - 1;
		 while (s < e) {
			 if (str.charAt(s) != str.charAt(e)) {
				 return false;
			 }
			 s++;
			 e--;
		 }
		 return true;
	 }
 
	 static void reverse(int[] arr, int s, int e) {
		 while (s < e) {
			 int temp = arr[s];
			 arr[s++] = arr[e];
			 arr[e--] = temp;
		 }
	 }
     // starting exclusive ending inclusive
	 static int getMax(int[] arr, int s, int e) {
		 int maxi = s;
		 for (int i = s + 1; i <= e; i++) {
			 if (arr[i] > arr[maxi]) {
				 maxi = i;
			 }
		 }
		 return maxi;
	 }

     // starting exclusive ending inclusive
     static int getMin(int[] arr, int s, int e) {
	     int mini = s;
		 for (int i = s + 1; i <= e; i++) {
			 if (arr[i] < arr[mini]) {
				 mini = i;
			 }
		 }
		 return mini;
	 }
 
	 static long lcm(long n1, long n2) {
		 return (n1 * n2) / gcd(n1, n2);
 	 }
 
	 static int lcm(int n1, int n2) {
		 return (n1 * n2) / gcd(n1, n2);
	 }
 
	 static long gcd(long num1, long num2) {
		 if (num2 == 0) {
			 return num1;
		 }
		 return gcd(num2, num1 % num2);
	 }
 
	 static int gcd(int num1, int num2) {
		 if (num2 == 0) {
			 return num1;
		 }
		 return gcd(num2, num1 % num2);
	 }

     //fastPow
     static long fastPow(long base, long exp) {
         if (exp==0) return 1;
         long half=fastPow(base, exp/2);
         if (exp%2==0) return mul(half, half);
         return mul(half, mul(half, base));
     }
 
     // multiply two long numbers % mod
     static long mul(long a, long b) {
         return a*b%mod;
     }
 
     static int nCr(int n, int r)
     {
        return factorial(n) / (factorial(r) *
            factorial(n - r));
     }
     
     // Returns factorial of n
     static int factorial(int n)
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
             return upBound(ll,tar,mid+1 ,r);
         }
 
         return upBound(ll,tar,l,mid-1);
     }
 
     static void swap(int a[] , int i , int j){
         int x = a[i];
         int y = a[j];
         a[j] = x;
         a[i] = y;
     }
     static void swap(long a[] , int i , int j){
         long x = a[i];
         long y = a[j];
         a[j] = x;
         a[i] = y;
    }
     // a -> z == 97 -> 122
 
     // String.format("%.9f", ans) ,--> to get upto 9 decimal places , (ans is double)
     
     // write 
 }
 