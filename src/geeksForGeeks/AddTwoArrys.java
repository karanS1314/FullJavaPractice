package geeksForGeeks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class AddTwoArrys {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int m=sc.nextInt();
			int b[]=new int[m];
			for(int i=0;i<m;i++) {
				b[i]=sc.nextInt();
			}
			int i=n-1;
			int j=m-1;
			int carry=0;
			ArrayDeque<Integer> al=new ArrayDeque<>();
			
			while(j>=0 && i>=0) {
				int k=a[i]+b[j]+carry;
				if(k>9) {
					al.addFirst(k-10);
					carry=1;
				}
				else {
					al.addFirst(k);
					carry=0;
				}
				i--;
				j--;
			}
			
				while(i>0) {
					int k=a[i]+carry;
					if(k>9) {
						al.addFirst(k-10);
						carry=1;
					}
					else {
						al.addFirst(k);
						carry=0;
					}
				i--;
				}
				if(i==0) {
					if(a[i]+ carry!=0) {
						al.addFirst(a[i]+carry);
						carry=0;
					}
				}
			
				while(j>0) {
					int k=b[j]+carry;
					if(k>9) {
						al.addFirst(k-10);
						carry=1;
					}
					else {
						al.addFirst(k);
						carry=0;
					}
				j--;
				}
				if(j==0) {
					if(b[j]+ carry!=0) {
						al.addFirst(b[j]+carry);
						carry=0;
					}
				}
				if(carry!=0) {
					al.addFirst(carry);
				}
			
			while(!al.isEmpty()){
				System.out.print(al.remove());
			}
			System.out.println();
		}

	}

}
