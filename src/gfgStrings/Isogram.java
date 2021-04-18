package gfgStrings;

import java.util.Scanner;

public class Isogram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
		String a=sc.nextLine();
		int c[]=new int[256];
		
		for(char e:a.toCharArray())
		{
			int index=(int)e;
			c[index]++;
		}		
		boolean isIsogram=true;
		
		for(int i=97;i<123;i++) {
			if(c[i]>1) {
				isIsogram=false;
				break;
			}
		}
		System.out.println(isIsogram);
		
		}
	}

}
