package geeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSpecificOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) 
		{
			int n=sc.nextInt();
			Long a[]=new Long[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
//			Arrays.sort(a);
//			int count=0;
//			for(int i=0;i<n;i++) {
//				if((a[i]&1)!=1) {
//					count++;
//			}
//			}
//			Long temp[]=new Long[n-count];
//			
//			int j=0;
//			
//			for(int i=n-1;i>=0;i--) {
//				if((a[i]&1)==1) {
//					temp[j++]=a[i];
//					
//				}
//				
//		        
//			}
//			for(Long e:temp) {
//				System.out.print(e+ " ");
//			}
//			
//			for(int i=0;i<n;i++) {
//				if((a[i]&1)!=1) {
//					count++;
//				System.out.print(a[i]+ " ");
//				}
//			}
			
			for(int i=0;i<n;i++) {
				if((a[i]&1)==1) {
					a[i]=-a[i];
				}
			}
			Arrays.sort(a);
			
			for(int i=0;i<n;i++) {
				if((a[i]&1)==1) {
					a[i]=-a[i];
				}
			}
			
			for(Long e:a) {
				System.out.print(e+ " ");
			}
			System.out.println();
			}
	
			
		}

	}


