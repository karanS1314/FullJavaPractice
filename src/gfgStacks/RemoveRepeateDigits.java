package gfgStacks;

import java.util.Scanner;
import java.util.Stack;

public class RemoveRepeateDigits {

	public static void main(String[] args) {
		
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0) {
		   
		   String s=sc.next();
		   Stack<Character> a=new Stack<>();
		   a.push(s.charAt(0));
		   for(int i=1;i<s.length();i++) {
			  if(s.charAt(i)!=a.peek()) {
				  a.push(s.charAt(i));
			  }
		   }
		   for(char e:a) {
			   System.out.print(e);
		   }
		   System.out.println();
		   
	   }
		
		

	}

}
