package gfgStrings;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s=sc.nextLine();
			StringBuffer res=new StringBuffer(s);
			
			int a[]=new int [256];
			for(int i=0;i<res.length();i++) {
				int index=(int)res.charAt(i);
				if(a[index]==0) {
					a[index]++;
				}
				else {
					res.deleteCharAt(i);
					i--;
				}
			}
			System.out.println(res);
					
				
			
		}

	}

}
