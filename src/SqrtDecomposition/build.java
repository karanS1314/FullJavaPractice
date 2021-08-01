package SqrtDecomposition;

import java.util.*;

public class build {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        // zero based indexing

        int len = (int)Math.ceil(Math.sqrt(n));

        // we are dealing with the min queries
        // like queries will be like find min in arr a between l and r inclusive
        int dec[] = new int[len];
        Arrays.fill(dec , Integer.MAX_VALUE);

        for(int i=0;i<n;i++){ // pre processing
           int idx = i/len;
           if(a[i] < dec[idx]){
               dec[idx] = a[i];
           }
        }

        int q = sc.nextInt();
        for(int i = 0; i <n n;)

        while(q-->0){
            int type = sc.nextInt();

            if(type == 0){// query root(n)
                int l = sc.nextInt();
                int r = sc.nextInt();
    
                int res = Integer.MAX_VALUE;
    
                while(l <= r){
                    if(l % len == 0 && l + len < r){
                        res = Math.min(res , dec[l/len]);
                        l += len;
                        continue;
                    }
    
                    res = Math.min(res , a[l]);
                    l++;
                }
    
                System.out.println(res);
            }
            else{// update o(1)
                int idx = sc.nextInt();
                int val = sc.nextInt();
                
                a[idx] = a[idx] + val;
                dec[idx/len] = Math.min(a[idx] , dec[idx/len]);
            }

        }
    }
}
