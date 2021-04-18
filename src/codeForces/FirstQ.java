package codeForces;

import java.util.*;

public class FirstQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=0;
		if(sc.hasNext())t = sc.nextInt();
		while(t-->0) {
			int k=0;
			if(sc.hasNext())k = sc.nextInt();
			int x=0;
			if(sc.hasNext())x = sc.nextInt();
			
			ArrayList<Integer> al = new ArrayList<>();
			for(int i=1;i<=x;i++) {
				if(x%i==0) {
					al.add(i);
				}
			}
			
			if(k==1) {
				System.out.println(1);
			}
			

			else {
				if(al.size()>2) {// no prime
					if(al.size()-1>k) {
						int sm=0;
						for(int i=1;i<=k;i++) {
							sm+=al.get(i);
						}
						System.out.println(sm);
					}
					else if(al.size()-1==k) {
						int sum=x+k-1;
						int sm=0;
						for(int i=1;i<=k;i++) {
							sm+=al.get(i);
						}
						System.out.println(Math.min(sum, sm));
					}
					else {
						int sm=0;
						for(int i=1;i<al.size();i++) {
							sm+=al.get(i);
						}
						
						sm+=(k-al.size()+1);
						
						int sum = x+ (k-1);
						System.out.println(Math.min(sum, sm));
					}	
				}
				
				
				else if(al.size()==2) { // prime
					if(k==2) {
						System.out.println(1+x);
					}
					else {
						int sm=0;
						sm+=(k-1);
						sm+=x;
						System.out.println(sm);
					}
					
				}
			
			}
			
		}

	}

}
