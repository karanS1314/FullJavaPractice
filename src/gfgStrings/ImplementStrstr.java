package gfgStrings;

import java.util.Scanner;

public class ImplementStrstr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s =sc.nextLine();
			sc.nextLine();
			
			String x=sc.nextLine();
			
//			boolean isFound=s.contains(x);
//			
//			if(!isFound) {
//				System.out.println(-1);
//				break;
//			}
//			else {
////				for(int i=0;i<=s.length()-x.length()+1;i++) {
////					if(s.charAt(i)==x.charAt(0)) {
////						System.out.println(i);
////						break;
//				System.out.println(s.indexOf(x));
//					}
			System.out.println(s.indexOf(x));
				
			}
		
	}


