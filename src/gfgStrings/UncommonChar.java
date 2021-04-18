package gfgStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UncommonChar {
	//****hashing

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String a=sc.nextLine();
			String b=sc.nextLine();
			
			Set<Character> sa=new TreeSet<>();
			for(int i=0;i<a.length();i++) {
				sa.add(a.charAt(i));
			}
			Set<Character> sb=new TreeSet<>();
			for(int i=0;i<b.length();i++) {
				sb.add(b.charAt(i));
			}
			for(int i=0;i<a.length();i++) {
			if(sb.contains(a.charAt(i))){
				sb.remove(a.charAt(i));
				sa.remove(a.charAt(i));
			}
			}
			sa.addAll(sb);
			for(char e: sa) {
			System.out.print(e);
			}
			System.out.println();
		}
	}

}
