package geeksForGeeks;

import java.util.Scanner;

public class FirstToOccurktimes {
	static int integers(int  n,int a[],int k) {
		int count[]=new int[1000000];
		int index=-1;
		for(int i=0;i<n;i++) {
			index=a[i];
			count[index]++;
			if(count[index]==k ) {
				return index;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) 
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int k=sc.nextInt();
			
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			System.out.print(integers(n, a, k));
			System.out.println();
		}
	}

}
