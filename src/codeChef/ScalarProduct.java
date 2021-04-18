package codeChef;

import java.util.LinkedList;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

public class ScalarProduct {
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
	static ArrayList<Integer> x = new ArrayList<>();
	static ArrayList<Integer> y = new ArrayList<>();
	
	static long dotProduct(ArrayList<Integer> x , ArrayList<Integer> y) { // to find the scalar product of two string path length
		long sp =0;
		for(int i=0;i<x.size();i++) {
			sp+=(x.get(i)*y.get(i))%m;

		}
		sp%=m;
		return sp;
	}
	static void dfs(int src, int dest, ArrayList<ArrayList<Integer>> adj , int a[], ArrayList<Integer> psr, boolean found , boolean xNot) {
		psr.add(a[src]);
		if(src==dest) {
			if(xNot) {
				for(int i =0;i<psr.size();i++) {
					x.add(psr.get(i));
				}
//				System.out.println(x);
			}
			else {
				for(int i =0;i<psr.size();i++) {
					y.add(psr.get(i));
				}
//				System.out.println(y);
			}
			return;
		}
		for(int nbr : adj.get(src)) {
			if(found) return;
			dfs(nbr , dest , adj , a , psr , found , xNot);
		}
		psr.remove(psr.size()-1);
		return;
	}
	public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner (System.in);
		int n =0;
		if(sc.hasNext())n =sc.nextInt();
		int q =0;
		if(sc.hasNext())q =sc.nextInt();
		
		//a[] is the weight array for each i holding a[i] weight
		int a[] = new int[n+1];
		for(int i=1;i<n+1;i++) {
			a[i]=sc.nextInt();
		}
		
		//building graph
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0;i<n+1;i++) {
			adj.add(i,new ArrayList<>());
		}
		
		//taking graph input stores relations between i
		for(int i=0;i<n-1;i++) {
			int src =0;
			if(sc.hasNext())src =sc.nextInt();
			int dest =0;
			if(sc.hasNext())dest =sc.nextInt();
			adj.get(src).add(dest);
		}
		//dp
//		Map<Integer,ArrayList<Integer>> map=  new HashMap<>();
		while(q-->0) {
			int c =0;
			if(sc.hasNext())c =sc.nextInt();
			int d =0;
			if(sc.hasNext())d =sc.nextInt();
			
//			if(map.containsKey(c)) {
//				for(int i =0;i<map.get(c).size();i++) {
//					x.add(map.get(c).get(i));
//				}
//			}
//			else {
				boolean found = false;
				boolean xNot = true;
				ArrayList<Integer> psr = new ArrayList<>();
				dfs(1,c,adj,a,psr,found,xNot);
//				map.put(c,x);
//			}
			
//			if(map.containsKey(d)) {
//				for(int i =0;i<map.get(c).size();i++) {
//					y.add(map.get(c).get(i));
//				}
//			}
//			else {
//				boolean found = false;
//				boolean xNot = false;
				xNot=false;
				psr.clear();
				dfs(1,d,adj,a,psr,found,xNot);
//				map.put(d,y);
//			}
//			
			long res = dotProduct(x,y);
			x.clear();
			y.clear();
			System.out.println(res);
			
		}
		
		
	}

}
