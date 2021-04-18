package hackerRankStrings;

import java.util.Scanner;

public class SuperReducedString {

	public static void main(String[] args) {
	  
		StringBuffer sbf= new StringBuffer();
		Scanner sc=new Scanner(System.in);
		sbf.append(sc.nextLine());
		
		boolean check=true;
		while(check) {
			check=false;
		for(int i=0;i<sbf.length()-1;i++) {
			if(sbf.charAt(i)==sbf.charAt(i+1)) {
				sbf.delete(i, i+2);
				check=true;
				}
			}
		}
		if(sbf.length()==0) {
			System.out.println("Empty String");
		}
		else {
			System.out.println(sbf);
		}

	}

}
