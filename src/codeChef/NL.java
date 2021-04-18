package codeChef;

import java.util.Scanner;

public class NL {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=0;
		if(sc.hasNext())t= sc.nextInt();
		
		while(t-->0) {
			int n=0;
			if(sc.hasNext())n= sc.nextInt();
			int f[] = new int[n];
			for(int i=0;i<n;i++) {
				f[i]=sc.nextInt();
			}
			if(f[0]==0) {
				System.out.println(0);
			}
			else {
				int sum =0;
				sum+=f[0];
				int count =0;
				boolean p=false;
				for(int i=1;i<n;i++) {
					sum--;
					sum+=f[i];
					count++;
					if(sum==0) {
						p=true;
						break;
					}
				}
				
				if(!p) {
					count+=sum;
				}
				
				System.out.println(count);
			}
		}

	}

}
