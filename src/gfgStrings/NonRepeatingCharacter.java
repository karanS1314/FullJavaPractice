package gfgStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			sc.hasNextLine();
			String s=sc.next();
			
			int a[]=new int [256];
			for(char e:s.toCharArray()) {
				int index=(int)e;
				a[index]++;
			}
			ArrayList<Character> b=new ArrayList<>();
			
			for(char e:s.toCharArray()) {
				int index=(int)e;
				if(a[index]==1) {
					b.add(e);
				}
			}
			if(b.size()==0) {
				System.out.println(-1);
			}
			else {
			char res=b.get(0);
			for(int i=0;i<b.size()-1;i++) {
				
				if(s.indexOf(b.get(i+1))<s.indexOf(b.get(i))) {
					res=b.get(i);
				}
			}
			System.out.println(res);
		}
		
		}
	}

}
