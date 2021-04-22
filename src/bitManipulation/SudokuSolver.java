 package bitManipulation;

 //   * * * its fun to do the impossible * * *   //
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.util.*;
  
 
 
 public class SudokuSolver {
    static void display(int mat[][]){
        System.out.println("the Solution is :");
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void solution(int mat[][] , int grid[][] , int rows[] , int cols[] , int i ,int j){
        if(i == 9){
            display(mat);
            return;
        }

        if(mat[i][j] > 0){
            solution(mat , grid , rows , cols , j == 8 ? i + 1 : i , j == 8 ? 0 : j + 1);
        }
        else{
            for(int num=1; num<=9; num++){
                if((rows[i] & (1 << num)) == 0 &&
                    (cols[j] & (1 << num)) == 0 &&
                    (grid[i/3][j/3] & (1 << num)) 
                    == 0){
                        mat[i][j] = num;
                        rows[i] ^= (1 << num);
                        cols[j] ^= (1 << num);
                        grid[i/3][j/3] ^= (1 << num); 
                        solution(mat , grid , rows , cols , j == 8 ? i + 1 : i , j == 8 ? 0 : j + 1);
                        rows[i] ^= (1 << num);
                        cols[j] ^= (1 << num);
                        grid[i/3][j/3] ^= (1 << num);
                        mat[i][j] = 0; 
                    }
            }
        }



    }
     public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        
        int n = 9;
        int mat[][] = new int[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int rows[] = new int[n];
        int cols[] = new int[n];
        int grid[][] = new int[n/3][n/3];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] > 0){
                    int bit = (1 << mat[i][j]);
                    rows[i] |= bit;
                    cols[j] |= bit;
                    grid[i/3][j/3] |= bit;
                }
            }
        }
        solution(mat , grid , rows , cols , 0 , 0);

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
 
     // write 
 
 }
 
