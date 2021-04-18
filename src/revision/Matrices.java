package revision;

import java.util.Scanner;

public class Matrices {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dimensions");
		int noOfRows=sc.nextInt();
		int noOfColumns=sc.nextInt();
		
		int a[][]=new int[noOfRows][noOfColumns];
		int b[][]=new int[noOfRows][noOfColumns]; 
		
		
		
		System.out.println("a");
		for(int j=0;j<noOfRows;j++) {
			
			for(int i=0;i<noOfColumns;i++) {
				a[j][i]=sc.nextInt();
				
			}
			
			
		}
		
		
        
		System.out.println("b");
		for(int j=0;j<noOfRows;j++) {
			
			for(int i=0;i<noOfColumns;i++) {
				b[j][i]=sc.nextInt();
				
			}
			
		}
		
		
		int c[][]=new int[noOfRows][noOfColumns];
		
        for(int j=0;j<noOfRows;j++) {
			
			for(int i=0;i<noOfColumns;i++) {
				c[j][i]=a[j][i]+b[j][i];
				
			}}
        System.out.println("result");
			for(int j=0;j<noOfRows;j++) {
				
				for(int i=0;i<noOfColumns;i++) {
					
					System.out.print(c[j][i] + " ");
				}
				System.out.println();
				
			}
			
		}
		
	}

