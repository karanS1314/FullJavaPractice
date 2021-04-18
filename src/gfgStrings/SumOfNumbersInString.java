package gfgStrings;

import java.util.Scanner;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String str=sc.next();
			int num=0;
			int sum=0;
			
			for(int i=0;i<str.length();i++) {
				if(Character.isDigit(str.charAt(i))){
					num=num*10 + (str.charAt(i)-'0');
				}
				else {
					sum+=num;
					num=0;
				}
			}
			sum+=num;
			System.out.println(sum);
		}
				

	}

}
