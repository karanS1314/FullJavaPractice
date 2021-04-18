package gfgStrings;

import java.util.Scanner;

public class BinaryString {
	static int substrings(int i) {
     int sum=0;
     
     for(int j=0;j<i;j++) {
    	 sum+=j;
     }
     return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			sc.nextLine();
			String s=sc.next();
			int ones=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='1') {
					ones++;
				}
			}
			System.out.println(substrings(ones));
		}
		

	}

}
