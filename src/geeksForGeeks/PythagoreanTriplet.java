package geeksForGeeks;

import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
			}
		boolean pythagorean=false;
		
		for(int i=0;i<n-2;i++) {
           for(int j=1;j<n-1;j++) {
        	   for(int k=2;k<n;k++) {
        		   int x=a[i]*a[i];
        		   int y=a[j]*a[j];
        		   int z=a[k]*a[k];
        		   if(x*y==z||y*x==z||x*z==y) {
        			   pythagorean=true;
        		   }
        	   }
           }
        
           }
		if(pythagorean) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
