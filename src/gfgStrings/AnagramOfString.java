package gfgStrings;

import java.util.Scanner;

public class AnagramOfString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String a=sc.nextLine();
			String b=sc.nextLine();
			
			int c[]=new int [256];
			
			for(char e:a.toCharArray()) {
				int index=(int)e;
				c[index]++;
			}
			for(char e:b.toCharArray()) {
				int index=(int)e;
				c[index]--;
			}
			int sum=0;
			for(int i=97;i<=122;i++) {
				sum+=Math.abs(c[i]);
			}
			System.out.println(sum);
			
		}

	}

}
