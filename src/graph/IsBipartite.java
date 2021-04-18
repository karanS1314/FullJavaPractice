package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


// a graph is said to be bipartite if two mutually and exhaistive set can be made 
// from the vertices of the graph.

// every acyclic graph is a bipartite
// cyclic with even number of vertices is a bipartite
// cyclic with odd number of vertices is not a bipartite


public class IsBipartite {
    static class Edge{
        int src;
        int dest;
        
        Edge(int src , int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static class Pair{
        int v;
        String psf;
        int lev;
         
        Pair(int v , int lev , String psf){
            this.v = v;
            this.psf = psf;
            this.lev=lev;
        }
    }
    public static boolean isBipartite(ArrayList<Edge> g[] , int src , int vis[]){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, 0 , src+ " "));

        while(q.size()>0){
            Pair x = q.poll();

            if(vis[x.v]!=-1){
                if(x.lev!=vis[x.v]) return false;
            }
            else{
                vis[x.v]=x.lev;
            }

            for(Edge e : g[x.v]){
                if(vis[e.dest]==-1){
                    q.add(new Pair(e.dest , x.lev+1, x.psf+e.dest));
                }
            }
        }
        return true;
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
            graph[src].add(new Edge(src, dest));
            graph[dest].add(new Edge(dest, src));
        }

        int vis[] = new int[vert];
        Arrays.fill(vis, -1);

        boolean found = true;
        for(int i=0;i<vert && found;i++){
            if(vis[i]==-1){
                if(!isBipartite(graph , i , vis)){
                    found = false;
                    break;
                }
            }
        }
        if(!found) System.out.println("false");
        else System.out.println("true");
        
 
    }
    


}
