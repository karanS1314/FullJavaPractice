package gfgTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import dataStructures.trees.LevelOrderTraverseInputMethod;
import dataStructures.trees.LevelOrderTraverseInputMethod.Node;


public class LeftViewOfBinaryTree extends LevelOrderTraverseInputMethod{
	
	static ArrayList<Integer> al=new ArrayList<>();
    static ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> res=new ArrayList<>();
      int n=left(root);
      for(int i=0;i<al.size();i++){
          res.add(al.get(i));
      }
      al.clear();
      
      return res;
    }
    
    static int left(Node root){
        if(root==null){
            return -1;
        }
        al.add(root.data);
       
        int n=left(root.left);
        if(n==-1){
            int m=left(root.right);
        }
        return 1;
    }
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		
		Node root=buildTree(s);
	
		for(int i=0;i<leftView(root).size();i++) {
			System.out.print(leftView(root).get(i)+ " ");
		}
		System.out.println();

	}

}
