package gfgTrees;

import java.util.Scanner;

import dataStructures.trees.LevelOrderTraverseInputMethod;

public class InorderSuccessor extends LevelOrderTraverseInputMethod {
	static Node inorderSuccessor(Node root,Node x)
    {
     if(root==null) return null;
     
     Node anc=x;
     if(anc.right!=null){
       //   if(anc.right.left==null) return anc.right;
         Node min=findMin(anc.right);
         return min;
     }
   
         Node res=findDeepest(root,x);
         return res;
    }
    static Node findMin(Node root){
        if(root==null) return null;
        Node left=findMin(root.left);
        if(left==null) return root;
        return null;
    }
    static Node findDeepest(Node root,Node x){
        if(root==null) return null;
        if(root.left==x){
            return root;
        }
        Node left=findDeepest(root.left,x);
        Node right=findDeepest(root.right,x);
        return null;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		Node root=buildTree(s);
		int k=sc.nextInt();
		Node x=new Node(k);
		inorderSuccessor(root, x);

	}

}
