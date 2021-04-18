package special;

import java.util.ArrayDeque;
import java.util.Scanner;

public class LongestValidSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s=sc.next();
			int ans=0;
			ArrayDeque<Integer> st=new ArrayDeque<>();
			
			st.push(-1);
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='(') {
					st.push(i);
				}
				else {
					st.pop();
					if(!st.isEmpty()) {
						ans=Math.max(ans, i-(st.peek()));
					}
					else {
						st.push(i);
					}
				}
			}
			System.out.println(ans);
			}

	}

}
