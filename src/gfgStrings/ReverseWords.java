package gfgStrings;

import java.util.Scanner;

public class ReverseWords {
	static String reverseWords(String s) {
		int n=s.length();
		int i=n-1;
		int j=n-2;
		int k=0;
		String reverse="";
		while(j>0) {
		if(s.charAt(j)!='.') {
			j--;
			
		}
		if(s.charAt(j)=='.') {
			reverse=reverse.concat(s.substring(j+1, i)).concat(".");
			i=j;
			j--;
	
		}
		}
		while(s.charAt(k)!='.' && k<n-1) {
			k++;
		}
		reverse=reverse.concat(s.substring(0, k));
		return reverse;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
			while(t-->0) {
				String s=sc.next();
				s=s.concat(" ");
				System.out.println(reverseWords(s));
			}	

	}

}
