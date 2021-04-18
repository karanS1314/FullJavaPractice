package graph;

import java.util.*;

// single source shortest path of a graph having negative edge wts
// we do not define the shortest path in the graph containing negative cycle;


public class BellmanFord {
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
        Scanner sc = new Scanner (System.in);
        int vert = sc.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[vert];
        // it is assumed here that each vertex is between [0 to vert-1]
        
        for(int i=0;i<vert;i++) {
            graph[i] = new ArrayList<>();
        }
        int edges = sc.nextInt();

        // this is the main arraylist that stores all the edges
        ArrayList<Edge> al = new ArrayList<>();

        for(int i=0; i<edges; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int wt = sc.nextInt();
            graph[src].add(new Edge(src, dest, wt));
            graph[dest].add(new Edge(dest, src, wt));
            al.add(new Edge(src, dest, wt));
        }
        int source = sc.nextInt();
        //in this path array we will store the min path from the source
        //given to the ith vertex
        int path[] = new int[vert];
        path[source]=0;

        Arrays.fill(path, Integer.MAX_VALUE);

        for(int i=0;i<vert-1;i++){
            // shortest path of length**(not wt) i will be updated in the ith iteration or smaller than ith
            for(int j=0;j<al.size();j++){
                if(path[al.get(j).src]== Integer.MAX_VALUE){
                    continue;
                }
                if(path[al.get(j).src]+al.get(j).wt<path[al.get(j).dest]){
                    path[al.get(j).dest]=path[al.get(j).src]+al.get(j).wt;
                }
            }
        }

        for(int i=0;i<vert;i++){
            if(path[i]!=Integer.MAX_VALUE){
                System.out.println(path[i]);
            }
            else{
                System.out.println(-1);
            }
        }




    }
    
}
