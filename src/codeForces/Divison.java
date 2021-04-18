package codeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Divison {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			long p = sc.nextLong();
			int q =sc.nextInt();
			
			ArrayList<Long> al = new ArrayList<>();
			
			long res=0;
			for (int i=1; i<=Math.sqrt(p); i++) 
	        { 
	            if (p%i==0) 
	            { 
	                if (p/i != i) {
	                    al.add( (p/i)); 
	                }
	                    al.add((long) i);
	            } 
	        }
			
			int str=0;
			boolean find=false;
			Collections.sort(al);
			for(int i=al.size()-1;i>=0;i--) {
				if(q>al.get(i)) {
					str=i;
					break;
				}
				if(al.get(i)%q!=0) {
					find=true;
					System.out.println(al.get(i));
					break;
				}
			}
			
			if(!find) {
				System.out.println(al.get(str));
			}

	}
	}
}
