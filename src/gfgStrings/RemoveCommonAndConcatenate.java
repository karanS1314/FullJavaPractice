package gfgStrings;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveCommonAndConcatenate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			
			String ans="";
			
			boolean not1[]=new boolean[s1.length()];
			boolean not2[]=new boolean[s2.length()];
			
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						not1[i]=true;
						not2[j]=true;
						
					}
				}
			}
			for(int i=0;i<s1.length();i++) {
				if(!not1[i]) {
					ans=ans+s1.charAt(i);
				}
			}
			for(int i=0;i<s2.length();i++) {
				if(!not2[i]) {
					ans=ans + s2.charAt(i);
				}
			}
			System.out.println(ans);
			
			char c[]=ans.toCharArray();
			Arrays.sort(c);
			System.out.println(new String(c));
			}

	}

}
