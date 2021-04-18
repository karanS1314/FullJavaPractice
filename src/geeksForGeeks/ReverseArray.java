package geeksForGeeks;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		
		for(int i=1;i<=t;i++) {
			int n=sc.nextInt();
		
			int a[]=new int[n];
			
			for(int j=0;j<n;j++) {
				 a[j]=sc.nextInt();
				 }
				 
				 
						for(int j=0;j<n/2;j++) {
							
								int temp=a[j];
								a[j]=a[n-j-1];
								a[n-j-1]=temp;
							
						}
					
			
				 
				 for(int e:a) {
					 System.out.print(e+ " ");
				 }
		}
			
		
				
			
		
		
		
	}
	}


