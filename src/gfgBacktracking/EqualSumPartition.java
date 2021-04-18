package gfgBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class EqualSumPartition {

	static boolean partition(int a[],int sum,int n,int i,ArrayList<Integer> al) {
		
		if(i==n || sum<0) {
			return false;
		}
		if(sum==0) {
			return true;
		}
		al.add(a[i]);
		if(partition(a, sum-a[i], n, i+1,al)) {
			return true;
		}
		
		al.remove(al.size()-1);
		return partition(a, sum, n, i+1, al);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			int sum=0;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				sum+=a[i];
			}
			ArrayList<Integer> al=new ArrayList<>();
			boolean isPossible = (sum&1)==0 && partition(a,sum/2,n,0,al);
			if(isPossible) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			
		}
	}

}
