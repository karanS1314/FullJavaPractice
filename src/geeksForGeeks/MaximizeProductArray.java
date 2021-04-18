package geeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeProductArray {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
	        int n=sc.nextInt();
		
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			long m=1000000007;
			Arrays.sort(a);
			 long res=0;
			for(int i=1;i<n;i++) {
				res=(res+(a[i]*i)%m)%m;
			}
			System.out.println(res);
 
	}

}
}