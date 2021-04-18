package codeChefDEC;

import java.util.Scanner;

public class VAccine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=0;
		if(sc.hasNext()) {
			t=sc.nextInt();
		}
		while(t-->0) {
			int n=0;
			if(sc.hasNext()) {
				n=sc.nextInt();
			}
			int k=0;
			if(sc.hasNext()) {
				k=sc.nextInt();
			}
			int a[] = new int[n+1];
			int sum =0;
			int i;
			for(i=1;i<=n;) {
				if(k==0||k==n) {
					break;
				}
				if(sum+1<=i+1 && k>0) {
					a[i]=i;
					sum+=i;
					i++;
					k--;
					continue;
				}
				if(sum>i) {
					a[i]=-i;
					sum-=i;
					i++;
					if(sum>0)
					k--;
					continue;
				}
				if(sum+1>i+1 && k==1) {
					a[i]=-i;
					i++;
					if(sum-i>0) 
					break;
					else {
						sum-=i;
						continue;
					}
				}
				if(sum+i>i+1 && k>1) {
					a[i]=i;
					if(sum>0) 
					k--;
					sum+=i;
					i++;
				}
			}
			if(k==n) {
				for(i=1;i<=n;i++) {
					a[i]=i;
				}
			}
			else if(i<=n) {
				for(;i<=n;i++) {
					a[i]=-i;
				}
			}
			
			for(i=1;i<=n;i++) {
				System.out.print(a[i]+ " ");
			}
			System.out.println();
		}
		
	}

}
