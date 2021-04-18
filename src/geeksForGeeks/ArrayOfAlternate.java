package geeksForGeeks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfAlternate {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) 
		{
			int  n=sc.nextInt();
			int a1[]=new int[n];
			for(int i=0;i<n;i++) {
				a1[i]=(sc.nextInt());
				}
			ArrayList<Integer> given=new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				given.add(a1[i]);
				}
			if(n==1) {
				System.out.println(given);
			}
			else {
			
			ArrayList<Integer> positive=new ArrayList<>();
			for(int i=0;i<n;i++) {
				if(given.get(i)>=0) {
					positive.add(given.get(i));
				
				}
			}
			int i=0;
			while(i<given.size()) {
				if(given.get(i)>=0) {
					given.remove(i);
				
				}
				else {
					i++;
				}
			}
			int ans[]=new int [n];
			int a=0;
			int b=0;
			int c=0;
			while(a<given.size()&& b<positive.size()) {
				ans[c++]=positive.get(b++);
				ans[c++]=given.get(a++);
			}
			while(b<positive.size()) {
				ans[c++]=positive.get(b++);
			}
			while(a<given.size()) {
				ans[c++]=given.get(a++);
			}
			
			for(int e:ans) {
				System.out.print(e+ " ");
			}
		}
		System.out.println();
		}

	}

}
