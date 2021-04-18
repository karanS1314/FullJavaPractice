package geeksForGeeks;

import java.util.Scanner;

public class AlternateTermsArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		
		for(int i=1;i<=t;i++) {
			int n=sc.nextInt();
		
			int a[]=new int[n];
			
			for(int j=0;j<n;j++) {
				 a[j]=sc.nextInt();
				 }
			
					for(int j=0;j<n;j=j+2) {
						System.out.print(a[j]+ " ");
						
					}
				
				}
			}

	}


