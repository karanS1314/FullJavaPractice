package gfgStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatedChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			sc.nextLine();
			String s=sc.next();
			int c[]=new int[256];
			int index=0;
			for(char e:s.toCharArray()) {
				 index=(int)e;
				c[index]++;
			}
			
			ArrayList<Character> repeatedChars=new ArrayList<>();
			for(char e:s.toCharArray()) {
				if(c[index]>1) {
					repeatedChars.add(e);
				}
			}
//			for(char f:repeatedChars) {
//				System.out.print(f+ " ")
			l
//			}
			System.out.println(repeatedChars);
			
		}

	}

}
