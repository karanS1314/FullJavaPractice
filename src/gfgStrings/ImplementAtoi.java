package gfgStrings;

import java.util.Scanner;

public class ImplementAtoi {
	static int atoi(String s) {
		int i=0;
		try{
			i=Integer.parseInt(s);
		}catch(NumberFormatException e) {
			return -1;
		}
		
		return i;
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String str=sc.nextLine();
			System.out.println(atoi(str));
		}

	}

}
