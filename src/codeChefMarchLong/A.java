package codeChefMarchLong;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;




public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t =0;
		if(sc.hasNext())t=sc.nextInt();
		
		while(t-->0) {
			int n =0;
			if(sc.hasNext())n=sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
		
			Arrays.sort(a);
			
			boolean notValid=false;
			long diff=0;
			
			for(int i=0;i<n;i++) {
				if(a[i]>i+1) {
					notValid=true;
					break;
				}
				diff+=a[i]-i-1;
			}

			if((diff&1)==0 || notValid) {
				System.out.println("Second");
			}
			else {
				System.out.println("First");
			}
		
		}
	
		
//		while(t-->0) {
//			String s = sc.nextLine();
//			ArrayList<Integer> al = new ArrayList<>();
//			for(int i=0;i<s.length();i++) {
//				if(s.charAt(i)=='1') {
//					al.add(i);
//				}
//			}
//			int cnt=0;
//			for(int i=0;i<al.size()-1;i++) {
//				if(al.get(i+1)!=al.get(i)+1) {
//					cnt++;
//				}
//			}
//			if(al.size()>=2 && al.get(al.size()-1)!=al.get(al.size()-2)) {
//				cnt++;
//			}
//			if(al.size()==1) {
//				cnt=1;
//			}
//			System.out.println(cnt);
//		}

	}

}
