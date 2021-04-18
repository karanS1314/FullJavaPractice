package gfgStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LongestPlindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s=sc.next();
			int n=s.length();
			
			ArrayList<String> a=new ArrayList<>();
			ArrayList<Integer> b=new ArrayList<>();
			
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
				b.add(count);
				if(count>0) {
					a.add(s.substring(i,i+count));
				}
			}
			int c[]=new int[b.size()];
			for(int i=0;i<b.size();i++) {
				c[i]=b.get(i);
			}
			Arrays.sort(c);
			int maxLength=c[b.size()-1];
	
			for(int i=0;i<a.size();i++) {
				if(a.get(i).length()<maxLength) {
				a.remove(i);
				i--;
				}
			}
			System.out.println(a.get(0));
		}


	}

}
