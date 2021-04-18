package gfgRecursion;

import java.util.Scanner;

public class PowerOfNumbers {

	static long power(long n,long r){
        if(r==0){
            return 1;
        }
        if((r&1)==1) return (n*power(n,r-1)%1000000007)%1000000007;
        
        return (power(n,r/2)%1000000007*power(n,r/2)%1000000007)%1000000007;
        
    }
	public static void main (String[] args) {
	
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     
	     while(t-->0){
	         long n=sc.nextLong();
	         long n1=n;
	         long r=0;
	         while(n>0) {
	        	 long rem=n%10;
	        	 r=r*10+rem;
	        	 n/=10;
	         }
	     
	         System.out.println(power(n1,r));
	         
	     }
	}
}
