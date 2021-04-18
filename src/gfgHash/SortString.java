package gfgHash;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s=sc.next();
			char c[]=s.toCharArray();
			Arrays.sort(c);
			System.out.println(new String(c));
		}

	}

}
