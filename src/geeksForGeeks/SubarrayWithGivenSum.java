package geeksForGeeks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();	
			}
			
			Set<Integer> s=new HashSet<>();
			
			int sum=0;
			s.add(0);
			int last=-1;
			int temp=0;
			int first=-1;
			
			for(int i=0;i<n;i++) {
				sum+=a[i];
				temp=sum;
				if(s.contains(sum-k)) {
					
					last=i+1;
					break;
				}
				s.add(sum);
			}
			if(last!=-1) {
			if(temp-k==0) {
				first=1;
			}else {
			  int sum1=0;
			  for(int i=0;i<last;i++) {
				
				sum1+=a[i];
				
				if(sum1==temp-k) {
					first=i+2;
					break;
				}
			  }
			}
			}
			if(last==-1) {
				System.out.println(-1);
			}else {
			System.out.println(first+ " "+ last);
			}
			}

	}

}
