package graph.dsu;

import java.util.*;

public class KruskalsMST {

    static class Edge implements Comparable<Edge>{
		int src;
		int dest;
		int wt;
		
		Edge(int i , int j , int k){
			src=i;
			dest=j;
			wt=k;
		}
        public int compareTo(Edge o){
            return this.wt-o.wt;
        }
	}
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
        Scanner sc = new Scanner(System.in);
		int vert = sc.nextInt(); 
		// vertices aagyi
		
		ArrayList<Edge>[] graph = new ArrayList[vert];
		// it is assumed here that each vertex is between [0 to vert-1]
		ArrayList<Edge> al = new ArrayList<>();
		for(int i=0;i<vert;i++) {
			graph[i] = new ArrayList<>();
		}
		int edges = sc.nextInt();
		
		for(int i=0; i<edges; i++) {
			int wt = sc.nextInt();
			int src = sc.nextInt();
			int dest = sc.nextInt();
			graph[src].add(new Edge(src, dest, wt));
			graph[dest].add(new Edge(dest, src, wt));

            al.add(new Edge(src , dest , wt));
		}
        //sorting all the edges on the basis of their weight
        Collections.sort(al);

        int par[] = new int[vert];
        for(int i=0;i<vert;i++) {
            par[i]=i;
        }

        
        int rank[] = new int[vert];

        int weight=0; // this will store the total cost of the mst

        for(int i=0;i<edges;i++){
            int x = get(al.get(i).src, par);
            int y = get(al.get(i).dest, par); 
            if(x==y){
                continue;
            } 
            else{
                union(x , y , par , rank);
                weight+=al.get(i).wt;
            }
        }

        // for(int i=0;i<vert;i++){
        //     System.out.println(i+" "+ par[i]);
        // }
        System.out.println("wt =" + weight);


    }
}
