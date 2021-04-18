package codeChef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Sclar {

	static ArrayList<Integer> x = new ArrayList<>();
	static ArrayList<Integer> y = new ArrayList<>();
	static long power(int a, int b) {
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return power(a,b/2)*power(a,b/2);
		}
		return a*power(a,b-1);
	}
	static long m = power(2,32);
	
	
	static long dotProduct(ArrayList<Integer> x , ArrayList<Integer> y) {
		long sp =0;
		for(int i=0;i<x.size();i++) {
			sp+=(x.get(i)*y.get(i))%m;
		}
		sp%=m;
		return sp;
	}
	
	
	static void printPath(LinkedList<Integer> adj[], int src , int dest, ArrayList<Integer> psf, boolean xNot , boolean vis[] , int a[]) {
		psf.add(a[src]);
		if(src==dest) {
			if(xNot) {
				for(int i=0;i<psf.size();i++) {
					x.add(psf.get(i));
//					System.out.print(psf.get(i) + " ");
				}
//				System.out.println();
			}
			else {
				for(int i=0;i<psf.size();i++) {
					y.add(psf.get(i));
//					System.out.print(psf.get(i) + " ");
				}
//				System.out.println();
			}
			return;
		}
		vis[src]=true;
		for(int nbr : adj[src]) {
			if(!vis[nbr]) {
				printPath(adj, nbr , dest , psf,xNot,vis,a);
			}
		}
		psf.remove(psf.size()-1);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n =0;
		if(sc.hasNext())n =sc.nextInt();
		int q =0;
		if(sc.hasNext())q =sc.nextInt();
		
		int a[] = new int[n+1]; // weight [i] input 1 based index
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
		}
		
		LinkedList<Integer> adj[] = new LinkedList[n+1];
		for(int i=0;i<=n;i++) {
			adj[i]= new LinkedList<>();
		}
		for(int i=1;i<=n-1;i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adj[src].add(dest);
			adj[dest].add(src);
		}
		
		while(q-->0) {
			int c =0;
			if(sc.hasNext())c =sc.nextInt();
			int d =0;
			if(sc.hasNext())d =sc.nextInt();
			
			//for c
			ArrayList<Integer> psf = new ArrayList<>();
			boolean xNot = true;
			boolean vis[]= new boolean[n+1];
			printPath(adj, 1 , c, psf, xNot, vis , a);
			
			//for d
			psf.clear();
			xNot = false;
			Arrays.fill(vis, false);
			printPath(adj, 1, d , psf, xNot, vis, a);
			
			long res = dotProduct(x , y);
			System.out.println(res);
			x.clear();
			y.clear();
		}
		

	}

}
