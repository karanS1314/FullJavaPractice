package gfgStrings;

import java.util.Scanner;

public class PermutationsOfString {
	static int factorial(int k) {
		 int fact=1;
	        for(int i=1;i<=k;i++) {
	        	fact*=i;
	        }
	        return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        String s=sc.next();
       
        String a[]=new String[factorial(s.length())];
        
        a[0]=s;
        
        for(int i=0;i<factorial(s.length()-1);i++) {
        	for(int j=0;j<factorial(s.length()-1);j++)
        }
	}

}
