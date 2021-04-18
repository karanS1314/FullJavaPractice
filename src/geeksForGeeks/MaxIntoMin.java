package geeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIntoMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
		int n1=sc.nextInt();
		
		int a[]=new int[n1];
		
		for(int j=0;j<n1;j++) {
			a[j]=sc.nextInt();
			}
        int n2=sc.nextInt();
		
		int b[]=new int[n2];
		
		for(int j=0;j<n2;j++) {
			b[j]=sc.nextInt();
			}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int result=a[n1-1]*b[0];
		System.out.println(result);
		}
	}

}
