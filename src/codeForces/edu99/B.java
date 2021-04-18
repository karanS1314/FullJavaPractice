package codeForces.edu99;

import java.util.*;

public class B {
	static void swap(int a[], int i, int j) {
		int temp = a[i]; 
        a[i] = a[j]; 
        a[j] = temp; 
	}
	static int dist(int a1, int b1, int a2 ,int b2) {
		int dist=0;
		dist=(Math.abs(a1-a2)+Math.abs(b1-b2));
		return dist;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int temp=-1;
			int a[][] = new int[n][2];
			for(int i=0;i<n;i++) {
				a[i][0]=sc.nextInt();
				a[i][1]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				
				boolean f =true;
				for(int j=0;j<n;j++) {
					if(i!=j && k<Math.abs(a[i][0]-a[j][0])+ Math.abs(a[i][1]-a[j][1])) {
						f=false;
						break;
					}
				}
				if(f) {
					temp=1;
					break;
				}
			}
		
			System.out.println(temp);
		}
	}

}
