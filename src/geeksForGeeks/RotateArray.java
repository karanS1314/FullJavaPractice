package geeksForGeeks;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int d=sc.nextInt();
			
			int a[]=new int[n];
			
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
				}
			for(int j=0;j<d;j++) {
                for(int k=n-1;k>=d;k--) {
                    int temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                }
			}
			
			for(int e:a) {
				System.out.print(e+" ");
			}
		}
		
		
	}

}
