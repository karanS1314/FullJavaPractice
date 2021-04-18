package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class BuildingGraph {
	
	static boolean hasPath(int s , int d , ArrayList<Edge> graph[], boolean vis[]) {
		if(s == d) return true;
		vis[s]= true;
		for(int i=0;i<graph[s].size();i++) {
			if(vis[graph[s].get(i).dest]!=true) {
			if(hasPath(graph[s].get(i).dest, d , graph, vis)) return true;
			}
		}
		vis[s]=false;
		return false;
	}
	
	static void allPaths(int s , int d , ArrayList<Edge> graph[] , boolean vis[], ArrayList<String> al, String psf){
		if(s == d) {
			al.add(psf);
			return;
		}
		vis[s]= true;
		for(int i=0;i<graph[s].size();i++) {
			if(vis[graph[s].get(i).dest]!=true) {
				allPaths(graph[s].get(i).dest, d , graph, vis, al,psf+graph[s].get(i).dest);
			}
		}
		vis[s]=false;
	}
	
	static void drawTreeAndGenerateComponents( ArrayList<Integer> comp, boolean vis[], ArrayList<Edge> graph[], int src) {
		vis[src]=true;
		comp.add(src);
		
		for(Edge edge : graph[src]) {
			if(vis[edge.dest]!=true) {
				drawTreeAndGenerateComponents(comp, vis , graph , edge.dest);
			}
		}
	}
	static class Edge{
		int src;
		int dest;
		int wt;
		
		Edge(int i , int j , int k){
			src=i;
			dest=j;
			wt=k;
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
		
		
//		print the graph 
//		for(int i=0;i<vert;i++) {
//			for(int j=0;j<graph[i].size();j++) {
//				System.out.println(graph[i].get(j).src + " " + graph[i].get(j).dest + " " + graph[i].get(j).wt);
//			}
//		}
		
		
		int s = sc.nextInt();
		int d = sc.nextInt();
		boolean vis[] = new boolean [vert];
		
		// check has Path from src to destination
		System.out.println( hasPath(s , d , graph, vis));
		
		
		//print all the paths from a source to dest in agiven graph
		ArrayList<String> al = new ArrayList<>();
		String psf=String.valueOf(s);
		allPaths(s ,d , graph , vis , al, psf);
		
		for(String x : al) {
			System.out.println(x);
		}
		
		//print connected parts of a graph
		ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
		boolean vis2[] = new boolean[vert];
		
		for(int i=0;i< vert ; i++) {
			if(vis2[i]!=true) {
				ArrayList<Integer> comp = new ArrayList<>();
				drawTreeAndGenerateComponents(comp, vis2 , graph , i);
				comps.add(comp);
			}
		}
		for(ArrayList<Integer> x : comps) {
			for(int e : x) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		

	}

}
