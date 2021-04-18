package codeChef;

import java.util.Scanner;

public class Worthiness {

	public static void main(String[] args) {
	

			Scanner sc=new Scanner (System.in);
		
		int t=0;
		if(sc.hasNext()) t=sc.nextInt();
		
		while(t-->0) {
			int n=0;
			if(sc.hasNext()) n=sc.nextInt();
			
			if(n%9!=0) {
				System.out.print(n%9);
			}
			
				for(int i=1;i<=n/9;i++) {
					System.out.print("9");;
				}
		
			for(int i=0;i<n;++i) {
				System.out.print("0");
				System.out.print("");
			}
			System.out.println();
			
				}
		
	}
}

