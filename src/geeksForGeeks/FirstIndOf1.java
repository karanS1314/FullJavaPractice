package geeksForGeeks;

import java.util.Scanner;

public class FirstIndOf1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
			}
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]==1) {
				System.out.println(i);
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(-1);
		}
		
		}
	}

}
