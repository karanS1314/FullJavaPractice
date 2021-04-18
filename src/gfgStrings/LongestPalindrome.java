package gfgStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s=sc.next();
			int n=s.length();
			
			ArrayList<Integer> a=new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				int count=0;
				int l=i;
				int r=n-1;
				while(l<=r) {
					if(s.charAt(l)==s.charAt(r)) {	
						if(l==r) {
						count+=1;
						}else {
							count+=2;
						}
						l++;
						r--;
					}
					else {
						count=0;
						r--;
						l=i;
					}
				}
				a.add(count);
			}
			int b[]=new int[a.size()];
			for(int i=0;i<a.size();i++) {
				b[i]=a.get(i);
			}
			Arrays.sort(b);
			System.out.println(b[b.length-1]);
		}

	}

}
