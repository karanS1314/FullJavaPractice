package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

import graph.BuildingGraph.Edge;

public class PrimsAlgo {
	static class Pair implements Comparable<Pair>{
		int v;
		int par;
		int wt;
		
		Pair(int v ,int par ,int wt){
			this.v = v;
			this.par = par; 
			this.wt = wt;
		}
		public int compareTo(Pair o) {
			return this.wt - o.wt;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vert = sc.nextInt(); 
		// vertices aagyi
		
		ArrayList<Edge>[] graph = new ArrayList[vert];
		// it is assumed here that each vertex is between [0 to vert-1]
		
		for(int i=0;i<vert;i++) {
			graph[i] = new ArrayList<>();
		}
		int edges = sc.nextInt();
		
		for(int i=0; i<edges; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			graph[src].add(new Edge(src, dest, wt));
			graph[dest].add(new Edge(dest, src, wt));
		}
		
		
		int strt = sc.nextInt();
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		boolean vis [] = new boolean [vert];
		pq.add(new Pair(strt, -1 , 0));
		int sum =0;
		
		while(pq.size()>0) {
			Pair curr = pq.remove();
			
			if(vis[curr.v]) {
				continue;
			}
			vis[curr.v]= true;
			
//			System.out.println(curr.v + " " + curr.par+ " " + curr.wt);
			sum+=curr.wt;
			for(Edge e : graph[curr.v]) {
				if(!vis[e.dest]) {
					pq.add(new Pair(e.dest , curr.v , e.wt));
				}
			}
		}
		System.out.println(sum);

	}

}
