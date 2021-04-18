package geeksForGeeks;

import java.util.Scanner;

public class SumOfArray {
	
	static int sum(int arr[],int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			 sum=sum+arr[i];
					}
		return sum;

	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		
		
		for(int i=1;i<=t;i++) {
			int n=sc.nextInt();
		
			int a[]=new int[n];
			
			for(int j=0;j<n;j++) {
				 a[j]=sc.nextInt();
				 }
			
			System.out.print(sum(a, n));

	}

}
}