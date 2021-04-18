package gfgStrings;

import java.util.Scanner;

public class MergeStrings {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			String s1=sc.next();
			String s2=sc.next();
			int n1=s1.length();
			int n2=s2.length();
			
			StringBuffer ans=new StringBuffer();
			
			
			int i=0;
			int j=0;
			
			
			while(i<n1 && j<n2) {
				ans=ans.append(Character.toString(s1.charAt(i++)));
				ans=ans.append(Character.toString(s2.charAt(j++)));
			}
			while(i<n1) {
				ans=ans.append(Character.toString(s1.charAt(i++)));
			}
			while(j<n2) {
				ans=ans.append(Character.toString(s2.charAt(j++)));
			}
			System.out.println(ans);
		}

	}

}
