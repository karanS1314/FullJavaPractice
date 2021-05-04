package fenwickTree;

import java.util.Scanner;

public class build {
    static void buildFenwickTree(int a[] , int farr[]){
        for(int i=1;i<a.length;i++){
            update(farr , i , a[i]);
        }
    }
    static void buildFTfaster(int a[] , int farr[]){
        int pre[] = new int[a.length];
        pre[1] = a[1];
        for(int i=2;i<a.length;i++){
            pre[i] = pre[i-1] + a[i];
        }

        for(int i=1;i<a.length;i++){
            int idash = i - (i & -i);
            farr[i] = pre[i] - pre[idash];
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=1;i<n+1;i++) a[i] = sc.nextInt();

        int farr[] = new int[n+1];// we deal whole problem as 1 based index
        // the whole fenwick tree is based on index and its imp with 2

        buildFenwickTree(a , farr); // in nlogn time complexity

        buildFTfaster(a , farr); // in o(n) time complexity

        int q = sc.nextInt();
        while(q-->0){
            int type = sc.nextInt();
            // if type == 0 then we have to get the sum from l to r 
            // else we have to update

            if(type == 0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                // both l and r are inclusive

                int res = getSum(a , farr , l , r);
                System.out.println(res);
            }
            else{
                int idx = sc.nextInt();
                int val = sc.nextInt();

                update(farr, idx, val);
            }
        }
    }
    static void update(int farr[] , int idx , int val){ // logn time
        while(idx < farr.length){
            farr[idx] += val;
            int x = (idx & -idx);
            idx += x;
        }
    }
    static int getSum(int a[] , int farr[] , int l , int r){ // logn time
        int res = prefixSum(farr , r) - prefixSum(farr , l-1);
        return res;
    }
    static int prefixSum(int farr[] , int idx){
        int res = 0;

        while(idx > 0){
            res += farr[idx];
            int x = (idx & -idx);
            idx -= x;
        }
        return res;
    }
}
