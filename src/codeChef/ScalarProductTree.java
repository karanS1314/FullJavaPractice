package codeChef;

import java.util.LinkedList;
import java.util.Scanner;

public class ScalarProductTree {
	static String x ="";
	static String y ="";
	
	static int sp(String x , String y) {
		int l = x.length();
		int sum = 0;
		for(int i=0;i<l;i++) {
			sum+=(x.charAt(i)-48)*(y.charAt(i)-48);
		}
		return sum;
	}
	
	static void printPath(LinkedList<Integer> adj[], int src , int dest, StringBuffer psf, boolean found, boolean vis[]) {
		if(src==dest) {
			if(found) {
				x=psf.toString();
			}
			else {
				y=psf.toString();
			}
			return;
		}
		
		vis[src]=true;
		for(int nbr : adj[src]) {
			if(!vis[nbr]) {
				printPath(adj, nbr , dest , psf.append(nbr),found,vis);
			}
			psf.deleteCharAt(psf.length()-1);
		}
		vis[src]=false;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int v=0;
		int q =0;
		if(sc.hasNext())v = sc.nextInt();
		if(sc.hasNext())q = sc.nextInt();
		
		LinkedList<Integer> adj[] = new LinkedList[v+1];
		int a[] = new int[v];
		for(int i=1;i<=v;i++) {
			adj[i]=new LinkedList<>();
			a[i-1]=sc.nextInt();
		}
		
		for(int i=0;i<v-1;i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adj[a[src-1]].add(a[dest-1]);
		}
	
		while(q-->0) {
			int src1=0;
			int src2=0;
			if(sc.hasNext())src1 = sc.nextInt();
			if(sc.hasNext())src2 = sc.nextInt();
			
			boolean vis1[] = new boolean[v+1];
			boolean found = true;
			StringBuffer psf1 = new StringBuffer("");
			printPath(adj,a[0],src1, psf1, found ,vis1);
			
			
			boolean vis2[] = new boolean[v+1];
			StringBuffer psf2 = new StringBuffer("");
			found = false;
			printPath(adj,a[0],src2, psf2, found,vis2);
			
			int res = sp(x, y);
//			System.out.println(x+ " "+y);
			System.out.println(res+ a[0]*a[0]);
		}


	}

}
