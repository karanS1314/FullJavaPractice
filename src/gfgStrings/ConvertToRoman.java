package gfgStrings;

import java.util.Scanner;

public class ConvertToRoman {
	
	static String toRoman(int n) {
		
		String ans="";
		
		String units[]= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		String tenth[]= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC" };
		
		String hundredth[]= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM" };
		
		String thousanth[]= {"","M","MM","MMM"};
		
		 ans=ans+thousanth[n/1000]+hundredth[(n%1000)/100]+tenth[(n%100)/10]+units[n%10];
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
         
		
		while(t-->0) {
			int n=sc.nextInt();
			
			System.out.println(toRoman(n));
			
		}

	}

}
