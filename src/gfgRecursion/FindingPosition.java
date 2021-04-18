package gfgRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingPosition {
	
	static void finalQueue(ArrayList<Integer> al,int n) {
		if(n==1) {
			return;
		}
		
		for(int i=0;i<al.size();i++) {
			al.remove(i);
		}
		
		finalQueue(al,al.size());
		return;
		
	}
	static void perQueue(ArrayList<Integer> al,int i) {
		
		if(i>al.size()-1) {
			return;
		}
		al.remove(i);
		perQueue(al,i+1);
		return;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=1;i<=n;i++) {
				al.add(i);
			}
			finalQueue(al, n);
			System.out.println(al.get(0));
		}

	}

}
