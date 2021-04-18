package revision;

import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		
		float sum=0;
		
		for(float i=1;i<=n;i++) {
			
			if(i%2==0) {
				sum=sum-1/i;
			
			}
			else {
				sum=sum+1/i;
				
				
			}
			
			}
			
			System.out.println(sum);
		}
		
		
		
		
		
		
	}


