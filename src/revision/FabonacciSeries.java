package revision;

import java.util.Scanner;

public class FabonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.print(0 + " ");
		
		int a=1;
		System.out.print(a + " ");
		int b=1;
		System.out.print(b + " ");
		
		
		
		
		int c=0;
		
		for (int i=1;i<=n-3;i++) {
			
			c=a+b;
			System.out.print( c+ " ");
			a=b;
			b=c;
			
			
		}
	}
}
