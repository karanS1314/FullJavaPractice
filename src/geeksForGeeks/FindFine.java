package geeksForGeeks;

import java.util.Scanner;

public class FindFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) 
		{
			int n=sc.nextInt();
			int d=sc.nextInt();
			
			int c[]=new int[n];
			int p[]=new int[n];
			
			
			for(int i=0;i<n;i++) {
				c[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				p[i]=sc.nextInt();
			}
			int fine=0;
			
			
			if((d&1)!=1) {
				for(int i=0;i<n;i++) {
					if((c[i]&1)==1) {
						fine+=p[i];
					}
				}
				
			}
			else {
				for(int i=0;i<n;i++) {
					if((c[i]&1)!=1) {
						fine+=p[i];
					}
				}
			}
			System.out.println(fine);
     
	}

}
}