package codeForces_edu105;

import java.util.ArrayList;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {

			StringBuffer s = new StringBuffer(sc.nextLine());
			ArrayList<Integer> al = new ArrayList<>();
			ArrayList<Integer> bl = new ArrayList<>();
			ArrayList<Integer> cl = new ArrayList<>();
			int a=0;
			int b=0;
			int c=0;
			int n =s.length();
			int a[] = new int[n];
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='A') {
					a++;
					al.add(i);
				}
				else if(s.charAt(i)=='B') {
					bl.add(i);
					b++;
				}
				else {
					cl.add(i);
					c++;
				}
			}
			
			if(s.charAt(0)=='A') {
				for(int i=0;i<al.size();i++) {
					a[al.get(i)]=1;
				}
			}
			else if(s.charAt(0)=='B') {
				for(int i=0;i<bl.size();i++) {
					a[bl.get(i)]=1;
				}
			}
			else if(s.charAt(0)=='C'){
				for(int i=0;i<cl.size();i++) {
					a[cl.get(i)]=1;
				}
			}
			
			
		}

	}

}
