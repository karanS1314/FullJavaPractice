package codeForces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ValeriiAgainstEveryone {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
	    int t = sc.nextInt();
	    while(t-->0) {
	    	int n = sc.nextInt();
	    	int b[]= new int[n];
	    	Set<Integer> set = new HashSet<>();
	    	for(int i=0;i<n;i++) {
	    		b[i]=sc.nextInt();
	    		set.add(b[i]);
	    	}
	    	if(set.size()<b.length) {
	    		System.out.println("YES");
	    	}
	    	else {
	    		System.out.println("NO");
	    	}
			
	    }
	}
    
} 


