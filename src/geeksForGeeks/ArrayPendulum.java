package geeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPendulum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
	        int n=sc.nextInt();
		
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
            
		  Arrays.sort(a);
		  if((n&1)==1) {
		  for(int i=n-1;i>=0;i=i-2) {
			  System.out.print(a[i]+ " ");
		  }
		  }
		  else {
			  for(int i=n-2;i>=0;i=i-2) {
				  System.out.print(a[i]+ " ");
			  }
		  }
		  for(int i=1;i<n;i=i+2) {
			  System.out.print(a[i]+ " ");
		  }
		  System.out.println();
		  
	}

}
}