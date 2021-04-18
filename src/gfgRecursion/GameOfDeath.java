package gfgRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GameOfDeath {

	static void god(ArrayList<Integer> al,int n,int k,int i) {
		if(n==1) {
			return;
		}
		int m=(i+k-1)%n;
		al.remove(m);
		
		god(al,n-1,k,m);
		return;
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=1;i<=n;i++) {
				al.add(i);
			}
			god(al,n,k,0);
			System.out.println(al.get(0));
			
			
			
		}

	}

}
