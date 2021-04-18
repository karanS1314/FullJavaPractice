package codeForces_edu105;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {

			String s = new String(sc.nextLine());
			int a=0;
			int b=0;
			int c=0;
			int n =s.length();
			if((n&1)!=0) {
				System.out.println("NO");
			}
			else {
				boolean found=true;
				for(int i=0;i<s.length();i++) {
					if(s.charAt(i)=='A') {
						a++;
					}
					else if(s.charAt(i)=='B') {
						b++;
					}
					else {
						c++;
					}
				}
				if(a==n/2 &&(s.charAt(0)!='A'||s.charAt(n-1)!='A') || b==n/2 &&(s.charAt(0)!='A'||s.charAt(n-1)!='B')|| c==n/2 &&(s.charAt(0)!='C'||s.charAt(n-1)!='C')) {
					Stack<Integer> st= new Stack<>();
					if(a==n/2) {
						for(int i=0;i<n;i++) {
							if(s.charAt(i)=='A') {
								st.push(-1);
							}
							else {
								if(st.isEmpty()) {
									found=false;
									break;
								}
								else {
									st.pop();
								}
							}
						}
						if(found && st.isEmpty()) {
							System.out.println("YES");
						}
						else {
							System.out.println("NO");
						}
					}
					else if(b==n/2) {
						for(int i=0;i<n;i++) {
							if(s.charAt(i)=='B') {
								st.push(-1);
							}
							else {
								if(st.isEmpty()) {
									found=false;
									break;
								}
								else {
									st.pop();
								}
							}
						}
						if(found && st.isEmpty()) {
							System.out.println("YES");
						}
						else {
							System.out.println("NO");
						}
					}
					else if(c==n/2) {
						for(int i=0;i<n;i++) {
							if(s.charAt(i)=='C') {
								st.push(-1);
							}
							else {
								if(st.isEmpty()) {
									found=false;
									break;
								}
								else {
									st.pop();
								}
							}
						}
						if(found && st.isEmpty()) {
							System.out.println("YES");
						}
						else {
							System.out.println("NO");
						}
					}
				}
				else {
					System.out.println("NO");
				}
			}
		}

	}

}
