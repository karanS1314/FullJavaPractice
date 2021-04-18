package geeksForGeeks;

import java.util.Scanner;

public class OddOccurence {
	static int oddOccured(int a[],int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			res=res^a[i];
			
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		int n=sc.nextInt();
		
		while (t>0) {
		if((n & 1)==1) {
		int a[]=new int[n];
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
			}
		
		
		System.out.print(oddOccured(a,n));
		}
		else {
			System.out.print(0);
		}
		System.out.println();
		
		t--;
		}
		

	}

}
