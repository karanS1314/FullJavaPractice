package oopsRevision;

import java.util.Scanner;

public class ReverseStringWbyWord {
	
	public static String reverseString(String s) {
		
		String ans="";
		int i=s.length()-1;
		
		while(i>=0) {
//			String ans="";
			
			while(i>=0 && s.charAt(i)==' ') {i--;}
				int j=i;
			
				
			
			while(i>=0 && s.charAt(i)!= ' ') {  i--;}
		    
			if(i<0) break;
			if(ans.isEmpty()) {
				ans=ans.concat(s.substring(i+1, j+1));
			    }
			else {
				ans=ans.concat(" " +s.substring(i+1, j+1));
			    }
		}
			
		
		return ans;
			
		
	}

	public static  void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String result=reverseString(s);
		int x=result.length();
		System.out.print(result+ " "+x);
//		String line="the karan";
//		String result=reverseString(line);
//		System.out.println(result);
		

	}

}
