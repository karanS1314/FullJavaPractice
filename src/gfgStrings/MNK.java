package gfgStrings;

import java.util.Scanner;

public class MNK {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int m= sc.nextInt();
			int k=sc.nextInt();
    		int n=sc.nextInt();
			int temp=m;
			StringBuffer binary=new StringBuffer("");
			
			while(temp!=0) {
				binary=binary.append(temp%2);
				temp/=2;
			}
			binary=binary.reverse();
			String ans=""; 
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<binary.length();j++) {
					if(binary.charAt(j)=='0') {
						ans+="01";
					}
					else {
						ans+="10";
					}
				}
			}
			
		   int res=ans.charAt(k)-'0';
		   System.out.println(res);
			
			
			
			
		}
		

	}

}
