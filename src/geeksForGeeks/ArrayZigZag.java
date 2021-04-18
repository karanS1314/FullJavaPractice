package geeksForGeeks;

import java.util.Scanner;

public class ArrayZigZag {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<n-1;i=i+2) {
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			
			for(int i=1;i<n-1;i=i+2) {
				if(a[i]<a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			
			for(int e:a) {
				System.out.print(e + " ");
			}
			System.out.println();
			t--;
		}
		
	}

}
