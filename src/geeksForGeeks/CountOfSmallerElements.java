package geeksForGeeks;

import java.util.Scanner;

public class CountOfSmallerElements {
	
	
//	static int smallerNumbers(int n,int arr[],int m) {
//		int k=0;
//		for(int i=0;i<n;i++) {
//			if(m>=arr[i]) {
//				k++;
//			}
//		}
//		return k;
//	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
              int t=sc.nextInt();
		
		
		
		for(int i=1;i<=t;i++) {
			int n=sc.nextInt();
		
			int a[]=new int[n];
			
			for(int j=0;j<n;j++) {
				 a[j]=sc.nextInt();
				 }
			int m=sc.nextInt();
			
//			System.out.print(smallerNumbers(n, a, m));
			int k=0;
			for(int j=0;j<n;j++) {
				if(m>=a[j]) {
					k++;
					
		
				}
			}
System.out.print(k);
	}

}
}