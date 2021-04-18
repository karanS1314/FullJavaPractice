package geeksForGeeks;

import java.util.Scanner;

public class ReversingSubarray {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		
		int a[]=new int[n];
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
			}
		
		for(int i=0;i<k/2;i++) {
			int temp=a[i];
			a[i]=a[k-i-1];
			a[k-i-1]=temp;
			
			
		}
		
		for(int i=k;i<n-1;i++) {
			int temp=a[n-1-i+k];
			a[n-1-i+k]=a[i];
			a[i]=temp;
		
		}
		
		for(int e:a) {
			System.out.print(e+" ");
	}

	}

}
