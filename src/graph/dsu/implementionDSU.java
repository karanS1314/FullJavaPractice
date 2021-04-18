package graph.dsu;

import java.util.Scanner;

public class implementionDSU {

    static int get(int a , int par[]){
        if(par[a]==a) return a;

        return par[a]=get(par[a], par);
    }
    static void union(int a , int b , int par[] , int rank[]){
        if(rank[a]==rank[b]){
            par[b]=a;
            rank[a]++;
        }
        else if(rank[a]>rank[b]){
            par[b]=a;
        }
        else{
            par[a]=b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int par[] = new int[n];
        int rank[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            par[i]=i;
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        union(a, b, par, rank);


    }
}
