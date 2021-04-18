package gfgStrings;

import java.util.Scanner;

public class RotatedString {

	 static boolean equal(String s1,String s2) {
		 int i=0;
		 boolean isEqual=true;
		 while(i<s1.length()) {
			 
			 if(s1.charAt(i)!=s2.charAt(i)) {
				 isEqual=false;
				 break;
						 
			 }else {
				 i++;
			 }
			 
		 }
		 return isEqual;
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s1=sc.nextLine();
			StringBuffer s2=new StringBuffer(sc.nextLine());
			
			if(s1.length()!=s2.length()) {
				System.out.println(0);
			}
			else {
				if(s1.length()==1 && equal(s1, s2.toString())) {
					System.out.println(1);
				}
				else {
				boolean rotated=false;
				for(int i=0;i<s2.length();i++) {
					s2.append(s2.charAt(0));
					s2.delete(0, 1);
					if(equal(s1,s2.toString())) {
						rotated=true;
						System.out.println(1);
						break;
					}
					
				}
				if (rotated==false) {
					System.out.println(0);
				}
			}
				}
		}

	}

}
