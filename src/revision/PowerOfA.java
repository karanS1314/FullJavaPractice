package revision;

import java.util.Scanner;

public class PowerOfA {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		
		
		
		int result=1;
		
	if(n!=0) {	for (int i=0;i<=n-1;i++) {
			result=a*result;
			
			
		}
		
		System.out.println(result);
	}
	
	else {
		System.out.println(1);
	}
	}

}
