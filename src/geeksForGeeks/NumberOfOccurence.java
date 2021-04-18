package geeksForGeeks;

import java.util.Scanner;

public class NumberOfOccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
		int n=sc.nextInt();
		int x=sc.nextInt();
		
		
		int a[]=new int[n];
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
			}
		int b[]=new int[1000];
		
		for(int i=0;i<n;i++) {
			if(x==a[i]) {
				b[x]++;
			}
		}
		
		int result=b[x];
		if(result!=0) {
			System.out.print(result);
		}
		else {
			System.out.print(-1);
		}
		System.out.println();
		t--;
		}

	}

}
