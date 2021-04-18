package graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import graph.BuildingGraph.Edge;

public class TopologicalSort {
	
	static void dfs(Stack<Integer> st , boolean vis[] , ArrayList<Edge> graph [], int src) {
		
		vis[src] = true;
		for(Edge e : graph[src]) {
			if(!vis[e.dest]) {
				dfs(st , vis , graph , e.dest);
			}
		}
		st.push(src);
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
//			int wt = sc.nextInt();
			int wt =0;
			graph[src].add(new Edge(src, dest, wt));
			graph[dest].add(new Edge(dest, src, wt));
		}
		
		boolean vis[] = new boolean[vert];
		Stack<Integer> st = new Stack<>();
		
		for(int i=0 ;i<vert ;i++) {
			if(!vis[i]) {
				dfs(st , vis , graph , i);
			}
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop()+ " ");
		}

	}

}
