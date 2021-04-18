package geeksForGeeks;

import java.util.Scanner;

public class MajorityElement {
	
	static int majorityElement(int b[],int n){
		int ans=-1;
		for(int i=0;i<1000000;i++) {
			if(b[i]>n/2) {
				ans=i;
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
			}
		
		int b[]=new int[1000000];
		
		int j=0;
		
		for(int i=0;i<n;i++) {
			j=a[i];
			b[j]++;
			
			
		}
			
		
				System.out.println(majorityElement(b, n));
			
			
		}
		
		
	}

}
