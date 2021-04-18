package geeksForGeeks;

import java.util.*;

public class kLargestElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
			}
		int k=sc.nextInt();
		
		Arrays.sort(a);
		
		for(int i=n-1;i>n-1-k;i--) {
			System.out.print(a[i]+ " ");
		}
		
		t--;
		}

	}

}
