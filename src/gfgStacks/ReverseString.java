package gfgStacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseString {

	static void reverse(String s) {
		ArrayDeque<Character> a=new ArrayDeque<>();
		for(int i=0;i<s.length();i++) {
			a.push(s.charAt(i));
		}
		StringBuffer ans=new StringBuffer("");
		for(int i=0;i<s.length();i++) {
			
			ans=ans.append(a.pop());
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
	    
	    while(t-->0) {
	    	String s=sc.next();
	    	reverse(s);
	    }
		
	}

}
