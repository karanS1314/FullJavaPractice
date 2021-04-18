package gfgStrings;

import java.util.Scanner;

public class ValidateIP {
	
//	static boolean charTest(String e) {
//		boolean charTest=true;
//		for(int i=0;i<e.length();i++) {
//			if(!Character.isDigit(e.charAt(i))){
//				charTest=false;
//				break;
//			}
//		}
//		return charTest;
//	}
	static boolean isValid(String s) {
		boolean valid=true;
	
		
//		if(s.isEmpty()) {
//			valid=false;
//		}
//		else {
		    String a[]=s.split("\\.");
		       if(a.length!=4) {
			     valid=false;
		        }
		       else {
		        	
		        for(String e:a) {
		        	
//				if(charTest(e)) {
					
				if(Integer.parseInt(e)>255||Integer.parseInt(e)<0) {
					valid=false;
				}
				
//				}
//				else {
//					valid=false;
//				}
			}
//		}
		    }
		return valid;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s=sc.next();
			System.out.println((isValid(s))); 
				
			
		
		}

	}

}
