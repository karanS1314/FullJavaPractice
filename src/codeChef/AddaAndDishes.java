package codeChef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class AddaAndDishes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int [n];
			for(int i=0;i<n;i++) {
				a[i] = 	sc.nextInt();
			}
			int smo=0;
			int smt=0;
			
			Arrays.sort(a);
			
			smo+=a[n-1];
			for(int i=n-2;i>=0;i--) {
				if(smt<smo) {
					smt+=a[i];
				}
				else {
					smo+=a[i];
				}
			}
			System.out.println(Math.max(smo, smt));
			
		}

	}

}
