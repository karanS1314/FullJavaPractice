package codeForces.Practicer;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static int solve(int n, ArrayList<Integer> al) {
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=al.get(i);
        }
        if(sum%3!=0) return 0;
        
        int a[] = new int[n];
        a[0]=al.get(0);
        
        int is=0;
        int js=0;
        int ks=0;
        int tar=sum/3;
        for(int i=1;i<n;i++){
            if(a[i-1]==tar){
                if(al.get(i)==0){
                    a[i]=a[i-1];
                }
                else{
                    if(is==0)is=i-1;
                    else if(js==0)js=i-1;
                    else if(ks==0)ks=i-1;
                    a[i]=al.get(i);
                }
            }
            else{
                a[i]=a[i-1]+al.get(i);
            }
       }
       for(int e : a){
           System.out.print(e+" ");
       }
       System.out.println();
       System.out.println(is +" "+js + " " + ks);
       int a1 = 0;
       for(int i=0;i<=is;i++){
           if(a[i]==tar){
               a1++;
           }
       }
        int b = 0;
       for(int i=is+1;i<=js;i++){
           if(a[i]==tar){
               b++;
           }
       }
        int c = 0;
       for(int i=js+1;i<=n-1;i++){
           if(a[i]==tar){
               c++;
           }
       }
       return a1*c*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int x =solve(n, al);
        System.out.println(x);

    }
}
