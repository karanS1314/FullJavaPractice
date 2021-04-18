package geeksForGeeks;

import java.util.Scanner;

public class ImmediateSmallerElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			
			int a[]=new int[n];
			
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
				}
			
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					System.out.print(a[j+1]+" ");
				}
				else {
					System.out.print(-1+ " ");
				}
				
			}
			System.out.print(-1);
			}

	}

}
