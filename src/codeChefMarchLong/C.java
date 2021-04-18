package codeChefMarchLong;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = 0;
		if(sc.hasNext())t=sc.nextInt();
		
		while(t-->0) {
			int c = 0;
			if(sc.hasNext())c=sc.nextInt();
			String s = Integer.toBinaryString(c);
			
			int n =s.length();
			int size=0;
		
			
			StringBuffer a = new StringBuffer("1");
			StringBuffer b = new StringBuffer("0");
			
			for(int i=1;i<n;i++) {
				if(s.charAt(i)=='0') {
					a.append("1");
					b.append("1");
				}
				else {
					a.append("0");
					b.append("1");
				}
			}
			
			
			int a1= Integer.parseInt(a.toString(),2);
			int b1= Integer.parseInt(b.toString(),2);
			
			System.out.println(a1*b1);
			
			
		}

	}

}
