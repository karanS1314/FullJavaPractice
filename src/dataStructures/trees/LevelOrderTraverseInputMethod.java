package dataStructures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import dataStructures.trees.MyTree.Node;

public class LevelOrderTraverseInputMethod {
	static ArrayList<Integer> al=new ArrayList<>();
	
	static void inOrder(Node root){
        if(root==null) return ;
		
		inOrder(root.left);
		al.add(root.data);
		inOrder(root.right);
		return;
    }
	public static class Node {
		public Node left;
		public Node right;
		public int data;
		
		public Node(int data){
			this.data=data;
		}
	}

	public static Node buildTree(String s) {
		if(s.charAt(0)=='N') {
			return null;
		}
		String ip[]=s.split(" ");
		
		Node root=new Node(Integer.parseInt(ip[0]));
		
		Queue<Node> q=new LinkedList<>();
		q.offer(root);
		
		int i=1;
		while(i<ip.length && q.size()>0) {
			Node currNode=q.poll();
			
			String currValue=ip[i];
			if(!currValue.equals("N")) {
				currNode.left=new Node(Integer.parseInt(currValue));
				q.add(currNode.left);
			}
			i++;
			if(i>=ip.length) {
				break;
			}
			currValue=ip[i];
			if(!currValue.equals("N")) {
				currNode.right=new Node(Integer.parseInt(currValue));
				q.add(currNode.right);
			}
			i++;
		}
		return root;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		
		Node root=buildTree(s);
		inOrder(root);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+ " ");
		}
		al.clear();
		System.out.println();
		

	}

}
