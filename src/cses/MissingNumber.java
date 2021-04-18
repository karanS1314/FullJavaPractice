package cses;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("number of digits?");
            
		int n=sc.nextInt();
		
		int numbers[]=new int[n-1];
		
		for(int i=0;i<n-1;i++) {
			numbers[i]=sc.nextInt();
		}
		
////		
//		int diff=0;
//		
//		for(int i=1;i<=n;i++) {
//			diff=numbers[i-1]-i;
//			if(diff!=0) {
//				System.out.println(i);
//			}
//			break;
//		}
		
		
		
//		for(int i=1;i<=n;i++) {
//			for(int j=0;j<n-1;j++) {
//				diff=numbers[j]-i;
//				
//				
//			}
//			if(diff!=0) {
//				System.out.println(i+1);
//				break;
//			}
//			
//		}
//	}

		int sum=0;
		
		for(int i=1;i<=n;i++) {
			sum+=i;
			}
		
		int actualSum=0;
		
		for(int i=0;i<n-1;i++) {
			actualSum+=numbers[i];
		}
		
		int diff=sum-actualSum;
		System.out.println(diff);
}
}