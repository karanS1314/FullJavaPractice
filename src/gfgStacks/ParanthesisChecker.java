package gfgStacks;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisChecker {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
     	int t=sc.nextInt();
        sc.nextLine();
		while(t-->0) {
			String s=sc.next();
			boolean pass=true;
			if((s.length()&1)==1) {
				
                pass=false;
			}
			if(pass) {
				boolean check=true;
			Stack<Character> a=new Stack<>();
			for(int i=0;i<s.length();i++) {
				
		    	if(s.charAt(i)=='['||s.charAt(i)=='('||s.charAt(i)=='{') {
				a.push(s.charAt(i));
			    }
		    	else if( !a.empty() && a.peek()=='[' && s.charAt(i)==']' ) {
					a.pop();
				}
				else if(!a.empty()&&a.peek()=='{' && s.charAt(i)=='}') {
					a.pop();
				}
				else if(!a.empty()&& a.peek()=='(' && s.charAt(i)==')') {
					a.pop();
				}
			     
				else  {
					check=false;
					break;
				}
			}
			
				
			if(check) {
			if(a.empty()) {
				System.out.println("balanced");
			}
			}
			else {
				System.out.println("not balanced");
			}
			}else {
				System.out.println("not balanced");
			}
			
		}		 
	   
	}

}
