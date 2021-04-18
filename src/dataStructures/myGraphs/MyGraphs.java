	package dataStructures.myGraphs;

import java.util.LinkedList;
import java.util.Scanner;

public class MyGraphs {

	static LinkedList<Integer> adj[];
	
	MyGraphs(int v) {
		 adj = new LinkedList[v];
		 
		 for(int i=0;i<v;i++) {
			 adj[i]=new LinkedList<Integer>();
		 }
	}
	
	void addEdge(int source , int dest) {
		adj[source].add(dest);
		adj[dest].add(source);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		MyGraphs graph = new MyGraphs(v);
		for(int i=0;i<e;i++) {
			int source = sc.nextInt();
			int dest = sc.nextInt();
			graph.addEdge(source, dest);
		}
		
		for(int i=0;i<v;i++) {
			System.out.println();
		}

	}

}
