package gfgStrings;

import java.util.Scanner;

public class RemoveConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			String enter=sc.nextLine();
			String s=sc.nextLine();
		
			StringBuffer sbf=new StringBuffer();
			
			
			char c[]= {'A','a','E','e','I','i','O','o','U','u',' '};
			
			for(int i=0;i<s.length();i++) {
				for(int j=0;j<11;j++) {
					if(s.charAt(i)==c[j]) {
                           sbf.append(s.charAt(i));
                             
                             break;
				         }
					
			        }
			
		       }

			String ans=sbf.toString();
			if(ans.trim().isEmpty()) {
				System.out.print("No Vowel");
			}
			else {
				System.out.print(ans);
			}
			
	
		}
	}

}
