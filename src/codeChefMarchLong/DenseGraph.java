package codeChefMarchLong;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class DenseGraph {
	
	static class Edge{
		int src;
		int nbr;
		
		Edge(int src ,int nbr){
			this.src=src;
			this.nbr=nbr;
		}
	}
	static class SScanner {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		long nextlong() {
			return Long.parseLong(next());
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
	static void BFS(ArrayList<Edge> gr[] , int src  ,int dest , boolean [] vis , Queue<Integer> q , int par[]){

		q.add(src);
		par[src]=-1;
		vis[src] = true;
		while(!q.isEmpty()) {
			int curr=q.poll();
			if(curr==dest) break;
			
			
			for(Edge e : gr[curr]) {
				if(vis[e.nbr]==false) {
					vis[e.nbr]=true;
					par[e.nbr]=curr;
					q.add(e.nbr);
				}
			}
		}
		
	}
	static boolean hasPath(int s , int d , ArrayList<Edge> graph[], boolean vis[]) {
		if(s == d) return true;
		vis[s]= true;
		for(int i=0;i<graph[s].size();i++) {
			if(vis[graph[s].get(i).nbr]!=true) {
				if(hasPath(graph[s].get(i).nbr, d , graph, vis)) return true;
			}
		}
		vis[s]=false;
		return false;
	}
	
	public static void main(String[] args) throws java.lang.Exception{
		try {
			SScanner sc = new SScanner();
			int t = sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				int src = sc.nextInt();
				int dest = sc.nextInt();
				
				
				if(src==dest) {
					System.out.println(0);
				}
				else {
					ArrayList<Edge> graph[] = new ArrayList[(int) (n+1)];
					for(int i=1; i<=n ;i++) {
						graph[i] = new ArrayList<>();
					}
					
					for(int i=0;i<m;i++) {
						int a = sc.nextInt();
						int b = sc.nextInt();
						int c = sc.nextInt();
						int d = sc.nextInt();
					
						for(int u=a; u<=b ; u++) {
							for(int v=c ; v<=d ; v++) {
								graph[u].add( new Edge(u , v));
								//directed graph
							}
						}
					}
					// till now a graph is ready which contains array of arraylists of edges
					
					boolean visf[] = new boolean [n+1];
					if(!hasPath(src , dest , graph, visf)) {
						System.out.println(-1);
					}
					else {
						int par[] = new int [n+1];
						
						boolean vis[] = new boolean [n+1];
						Queue<Integer> q = new LinkedList<>();
						
						BFS(graph , src , dest , vis , q , par);
						// from this bfs funtion i m expecting that it will fill the parent array
						
						int curr = dest;
						long dist =0;
						while(par[curr]!=-1) {
							curr= par[curr];
							dist++;
						}
						System.out.println(dist);
						
					}
				
						
					
				}
				
				
			}
		}catch(Exception e){
			return;
		}
		

	}

}
