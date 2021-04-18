package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;




public class IntersectionOfArrays {
	static int remove_duplicate(int a[],int n) {
		if(n==0||n==1) {
			return n;
			
		}
		
	    
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
			temp[j++]=a[i];	
			}
		
			
		}
		
		temp[j++]=a[n-1];
		
		
		
		for(int i=0;i<j;i++) {
			a[i]=temp[i];
		}
		return j;
		
	}
	
	static int NumberOfElementsIntersection(int a[],int b[],int n,int m) {
		int i=0;
		int j=0;
		Arrays.sort(a);
		n=remove_duplicate(a,n);
		m=remove_duplicate(b, m);
		
		Arrays.sort(b);
		ArrayList<Integer> res=new ArrayList<>();
		
		while(i<n && j<m) {
			if(a[i]-b[j]>0) {
				j++;
			}
			else if(a[i]-b[j]<0) {
				i++;
			}
			else if (a[i]-b[j]==0){
				res.add(a[i]);
				i++;
				j++;
			}
		}
//		for(int k=0;k<res.size()-1;k++) {
//			if(res.get(i)==res.get(i+1)) {
//				res.remove(i+1);
//			}
		
//		int k=0;
//		while(k<res.size()-1 ){
//			if(res.get(i)==res.get(i+1)) {
//				res.remove(i+1);
//				k++;
//			}
//		}
		
		return res.size();
		
		
	}

	public static void main(String[] args) {
		
		
                 
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int [n];
			
			int m=sc.nextInt();
			int b[]=new int [m];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<m;i++) {
				b[i]=sc.nextInt();
			}
			
			
			
			System.out.println(NumberOfElementsIntersection(a, b, n, m));
			
		}
	}

}
