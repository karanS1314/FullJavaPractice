package geeksForGeeks;

import java.util.*;


public class ClosestNumber {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner (System.in);	
        int t=sc.nextInt();
		
		while(t>0) {
			int n=sc.nextInt();
			int a[]=new int [n];
			
			int k=sc.nextInt();
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int min[]=new int[n];
			
			for(int i=0;i<n;i++) {
				min[i]=Math.abs(k-a[i]);
				
			}
			Arrays.sort(min);
			int number=k+min[0];
			int number2=k-min[0];
			
			boolean numberPresent=false;
			
			for(int i=0;i<n;i++) {
				if(number==a[i]) {
					numberPresent=true;
				}
				
				}
			if(numberPresent) {
				System.out.println(number);
			}
			else {
				System.out.println(number2);
			}
				
			}

	}

}
