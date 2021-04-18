package gfgStacks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackDesigner {
	public static Stack<Integer>_push(ArrayList<Integer> a,int n){
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			Stack<Integer> a= new Stack<>();
			a.em
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				a.add(x);			
				}
			Stack<Integer> mys=_push(a,n);
			
			_pop(mys);
			
			System.out.println();
			}

	}

}
