package gfgStrings;

import java.util.Scanner;

public class Subesequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) 
		{
		String a=sc.next();
		String b=sc.next();
		
		if(a.length()==0) {
			System.out.println(1);
		}
		else {
			boolean isPresent=false;
			int i=0;
			int j=0;
			while(i<a.length() && j<b.length()) {
				if(a.charAt(i)==b.charAt(j)) {
					i++;
				}
				if(i==a.length()) {
					isPresent=true;
					System.out.println(1);
					break;
				}
				j++;
			}
			if(!isPresent) {
				System.out.println(0);
			}
		}
		
		}

	}

}
