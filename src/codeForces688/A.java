package codeForces688;

import java.util.*;


public class A {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int t = sc.nextInt();
			
			while(t-->0) {
				int n = sc.nextInt();
				
				sc.nextLine();
				StringBuffer a = new StringBuffer(sc.nextLine());
				
				int count=0;
				for(int i=0;i<a.length();i++) {
					if(a.charAt(i)=='b') {
						count++;
						a.deleteCharAt(i);
						i--;
					}
				}
				String b="";
				for(int i=0;i<count;i++) {
					b=b+'b';
				}
				System.out.println(b+a);
				
				
				
				
					
				
			}
				

	}

}
