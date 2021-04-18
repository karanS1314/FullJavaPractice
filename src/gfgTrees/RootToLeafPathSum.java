package gfgTrees;

import java.util.Scanner;


import dataStructures.trees.LevelOrderTraverseInputMethod;

public class RootToLeafPathSum extends LevelOrderTraverseInputMethod {
	static int sum=0;
   static boolean hasPathSum(Node root, int k) {
        boolean res=hsPathSum(root,k);
        sum=0;
        return res;
    }
    
    
   static  boolean hsPathSum(Node root,int k){
        if(root==null) return false;
        
        sum+=root.data;
       
        if(sum==k && root.left==null && root.right==null){
            return true;
        }
        
        boolean left=hsPathSum(root.left,k);
        boolean right=hsPathSum(root.right,k);
        if(left || right){
            return true;
        }
        sum=sum-root.data;
        return false;
    }

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s=sc.nextLine();
			int k=sc.nextInt();
			Node root=buildTree(s);
			System.out.println(hasPathSum(root, k));
		}
	}

}
