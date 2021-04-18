package gfgStrings;

import java.util.Scanner;

public class StrRotatedBy2Places {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
//			StringBuffer a=new StringBuffer(sc.next());
//			StringBuffer b=new StringBuffer(sc.next());
			String a=sc.next();
			String b=sc.next();
			if(a.length()!=b.length()) {
				System.out.println(0);
			}
			else {
				StringBuffer d=new StringBuffer(a);
			char d0=d.charAt(0);
			char d1=d.charAt(1);
				d.delete(0,2 );
			d.append(d0);
			d.append(d1);
			
			StringBuffer c=new StringBuffer(b);
			char c0=c.charAt(0);
			char c1=c.charAt(1);
				c.delete(0,2 );
			c.append(c0);
			c.append(c1);
		
			int la=a.length();
			int lb=b.length();
			int i=0;
			int j=0;
			boolean equal1=true;
			boolean equal2=true;
			
			
			while(i<la) {
				if(d.charAt(i)!=b.charAt(i)) {
					equal1=false;
					break;
					
				}
				else {
					i++;
				}
			
			}
			while(j<la) {
				if(a.charAt(j)!=c.charAt(j)) {
					equal2=false;
					break;
					
				}
				else {
					j++;
				}
			
			}
			if(equal1||equal2) {System.out.println(1);}
			else { System.out.println(0);}
			}
		}

	}

}
