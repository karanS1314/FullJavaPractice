package geeksForGeeks;

import java.util.Scanner;

public class ConvertToPrime {
	static boolean prime(int sum) {
		boolean isPrime=true;
		
		for(int i=2;i*i<=sum;i++) {
			if(sum%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) 
		{
			int n=sc.nextInt();
			int a[]=new int[n];
	
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			int sum=0;
			for(int i=0;i<n;i++) {
				sum+=a[i];
			}
			int result=0;
			for(int i=1;i<100;i++) {
				int k=1;
				if(!prime(sum)) {
					sum+=k;
				}
				else {
					result=i-1;
					break;
				}
			}
			System.out.println(result);
			
		}

	}

}
