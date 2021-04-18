package codeForces;


import java.util.Scanner;


public class ArrayRearrangement {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			
//			Set<Integer> set = new HashSet<>();
//			for(int i=0;i<n;i++) {
//				int a = sc.nextInt();
//				set.add(a);
//			}
			int a[] = new int[n];
			int b[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				b[i]=sc.nextInt();
			}
			
			boolean res = true;
			for(int i=0;i<n;i++) {
				if(a[i]+b[n-1-i]>x) {
					res=false;
					break;
				}
			}
			if(res) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
			
			
		}

	}

}
