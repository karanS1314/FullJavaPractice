package geeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class TypeOfArray {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) 
		{
			int n=sc.nextInt();
		    long a[]=new long[n];
	
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			int x=0;
			int check_asc=0;
			int check_desc=0;
			
			for(int i=0;i<n-1;i++) {
				if(a[i]<a[i+1]) {
					check_asc++;
				}
			}

			for(int i=0;i<n-1;i++) {
				if(a[i]>a[i+1]) {
					check_desc++;
				}
			}
			if(check_asc==n-1) {
				x=1;
			}
			else if(check_asc<(n-1) && check_asc>=1 && check_desc==1 ) {
				x=4;
			}
			
			if(check_desc==n-1) {
				x=2;
			}
			else if(check_desc<(n-1) && check_desc>=1 && check_asc==1 ) {
				x=3;
			}
			
			Arrays.sort(a);
			
			System.out.println(a[n-1]+ " "+ x);
			
	
		}
	}
}
