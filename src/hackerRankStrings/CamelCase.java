package hackerRankStrings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		int count=1;
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		
	   if(s.isEmpty()) {
		   System.out.println(0);
	   }
	   else {
		   System.out.println(count);
	   }
	}

}
