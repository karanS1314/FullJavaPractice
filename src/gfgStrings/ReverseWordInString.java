package gfgStrings;

import java.util.Scanner;

public class ReverseWordInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s=sc.nextLine();
            String ans="";
            String a[]=s.split("\\.");
             
            for(String e:a) {
            	StringBuffer sbf=new StringBuffer(e);
            	sbf.reverse();
            	ans=ans.concat(sbf.toString()+ " ");
            }
            ans= ans.trim();
            ans=ans.replace(" ", ".");
            System.out.println(ans);
				}
				
			}
			
			
		
		
	}


