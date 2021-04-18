package cses;

import java.util.Scanner;

public class BeautifulPermutation {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
	if(n==1 || n>=4  ) {
		for(int i=2;i<=n;i=i+2) {
			System.out.print(i + " ");
		}
		
		for(int i=1;i<=n;i=i+2) {
			System.out.print(i + " ");
		}

	}
	else {
		System.out.println("NO SOLUTION");
	}
	}
}
