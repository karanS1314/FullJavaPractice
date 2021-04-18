package gfgTrees;

import java.util.Scanner;

class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data=data;
	}
}
public class ArrayToBST {
	static Node root= null;
	static void bst(int a[],int l, int r,Node nod) {
		if(l>r) return;
		int mid=(r+l)/2;
		if(l==r) mid=l;
		if(root==null) {
			root=new Node(a[mid]);
			bst(a,l,mid-1,root);
			bst(a,mid+1,r,root);
			return ;
		}
		if(nod.data>a[mid]) {
			Node node=new Node(a[mid]);
			nod.left=node;
//			bst(a,l,mid-1,node);
//			bst(a,mid+1,r,node);
		}
		else if(nod.data<a[mid]) {
			Node node=new Node(a[mid]);
			nod.right=node;
//			bst(a,l,mid-1,node);
//			bst(a,mid+1,r,node);
		}
		bst(a,l,mid-1,node);
		bst(a,mid+1,r,node);
		return ;
	}

	static void preOrder(Node nodee) {
		if(nodee==null) return;
		
		System.out.print(nodee.data+ " ");
		preOrder(nodee.left);
		preOrder(nodee.right);
	}
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		   int t=sc.nextInt();
		   
		   while(t-->0){
		       int n=sc.nextInt();
		       int a[]=new int[n];
		       for(int i=0;i<n;i++){
		           a[i]=sc.nextInt();
		       }
		       bst(a,0,n-1,root);
		      
		       preOrder(root);
		       root=null;
		       System.out.println();
		   }
	}

}
