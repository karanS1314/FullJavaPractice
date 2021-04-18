package codeForces;

import java.util.Scanner;
import java.util.Stack;

public class Twobrackets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s = sc.nextLine();
			Stack<Character> sq = new Stack<>();
			Stack<Character> cir = new Stack<>();
			
			int pairs=0;
			int n = s.length();
			for(int i=0;i<n;i++) {
				if(s.charAt(i)=='(') {
					cir.push('(');
				}
				else if(s.charAt(i)==')') {
					if(!cir.isEmpty()) {
						cir.pop();
						pairs++;
					}
				}
				else if(s.charAt(i)=='[') {
					sq.push('[');
				}
				else if(s.charAt(i)==']') {
					if(!sq.isEmpty()) {
						sq.pop();
						pairs++;
					}
				}
			}
			
			System.out.println(pairs);
		}

	}

}
