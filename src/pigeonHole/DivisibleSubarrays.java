package pigeonHole;

import java.util.Scanner;

public class DivisibleSubarrays {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
			int n=sc.nextInt();
			int k=sc.nextInt();
			long a[]=new long[n];
			
			for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();	
			}
			
			long sum=0;
			long b[]=new long[k];
			b[0]=1;
			
			for(int i=0;i<n;i++) {
				sum+=a[i];
			    long m=((sum)%k);
			    if(m<0) {
			    	m=m+k;
			    }
			    
			    b[(int)m]++;
			}
			int res=0;
			for(int i=0;i<k;i++) {
				res+=b[i]*(b[i]-1)/2;
			}
			System.out.println(res);
	}

}
