package codeChef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestoreSequence {
	static int mx=4000001;
	static ArrayList<Integer> p;
	static boolean prime[]= new boolean[mx];

	static void gs() {
		p= new ArrayList<>();
		 for(int i=0;i<mx;i++) 
	            prime[i] = true; 
	          
	        for(int p = 2; p*p <mx; p++) 
	        { 
	            if(prime[p] == true) 
	            {
	                for(int i = p*p; i < mx; i += p) 
	                    prime[i] = false; 
	            } 
	        } 
	        
	        for(int i = 2; i < mx; i++) 
	        { 
	            if(prime[i] == true) 
	               p.add(i);
	        } 

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=0;
		if(sc.hasNext()) t=sc.nextInt();
		gs();
		while(t-->0) {
			int n=0;
			if(sc.hasNext()) n=sc.nextInt();
			int b[] = new int[n];
			for(int i=0;i<n;i++) {
				b[i]=sc.nextInt();
			}
			
			int res[] = new int[n];
			for(int i=0;i<n;i++) {
				res[i]=p.get(i);
			}
			
			for(int i=0;i<n;i++) {
				res[i]=res[b[i]-1];
				System.out.print(res[i]+ " ");
			}
			
			System.out.println();
		}
	

	}

}
