package gfgStrings;

import java.util.Scanner;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t>0) {
			String s=sc.nextLine();
			
			int c[]=new int[256];
			char res='1';
			for(char e:s.toCharArray()) {
				int index=(int)e;
				if(c[index]==0) {
				c[index]++;
				}
				else {
					res=e;
					break;
				}
			}
			if(res=='1') {
				System.out.println(-1);
			}
			else {
				System.out.println(res);
			}
			t--;
		}
		

	}

}
