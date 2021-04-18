package gfgStrings;

import java.util.Scanner;

public class AnagramPalindrome {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s=sc.next();
			int n=s.length();
			boolean odd=true;
			if((n&1)==0) {
				odd=false;
			}
			int c[]=new int [256];
			for(char e:s.toCharArray()) {
				int index=(int)e;
				c[index]++;
			}
			int count=0;
			for(int i=0;i<256;i++) {
				if(c[i]>0) {
					count++;
				}
			}
			int m=0;
			if(odd) {
				m=count-1;
			}
			else {
				m=count;
			}
			int l=0;
			for(int i=0;i<256;i++) {
				if((c[i]&1)==0 && c[i]>0) {
					l++;
				}
				}
			if(l==m) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			
		}
				

	}

}
