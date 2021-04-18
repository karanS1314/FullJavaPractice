package codeChef;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ScalarBFS {
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
	
//	static void BFS(int src , ArrayList<ArrayList<Integer>> adj , int parent[]) {
//		Queue<Integer> q = new LinkedList<>();
//		q.add(src);
//		while(!q.isEmpty()) {
//			int cur = q.poll();
//			for(int nbr : adj.get(cur)) {
//				q.add(nbr);
//				parent[nbr] = cur;
//			}
//		}
//	}

	public static void main(String[] args) {
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
		
		int parent[] = new int[n+1];
		parent[0]=-1;
		Queue<Integer> qu = new LinkedList<>();
		qu.add(1);
		while(!qu.isEmpty()) {
			int cur = qu.poll();
			if(adj.get(cur).size()!=0) {
				for(int nbr : adj.get(cur)) {
					qu.add(nbr);
					parent[nbr] = cur;
				}
			}
		}
//		BFS(1 , adj , parent);
		
		while(q-->0) {
			int c =0;
			if(sc.hasNext())c =sc.nextInt();
			int d =0;
			if(sc.hasNext())d =sc.nextInt();
			
			ArrayList<Integer> pathC= new ArrayList<>();
			int cur=c;
			while(parent[cur] != -1) {
				pathC.add(a[cur]);
				cur=parent[cur];
			}
			
			ArrayList<Integer> pathD= new ArrayList<>();
			cur=d;
			while(parent[cur] != -1) {
				pathD.add(a[cur]);
				cur=parent[cur];
			}
			System.out.println(dotProduct(pathC , pathD));
		}

	}

}
