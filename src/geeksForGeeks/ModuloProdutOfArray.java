package geeksForGeeks;

import java.util.Scanner;

public class ModuloProdutOfArray {
	static Long result(Long a[],Long m,int n) {
		Long result=1L;
		for(int i=0;i<n;i++) {
			result=(result*a[i])%m;
		}
		return result;
		
	}
	

	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			Long a[]=new Long[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			
			Long m=1000000007L;
			System.out.println(result(a, m,n));
			
		}

	}

}
