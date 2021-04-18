package geeksForGeeks;

import java.util.Scanner;

public class BinarySearch {
	
	static int bin_search(int A[], int left, int right,  int k)
	{

		int mid=left+(right-left)/2;
		while(left<=right){
		    if(k==A[mid]){
		        return mid;
		    }
		    else if(k<A[mid]){
		        right=mid-1;
		    }
		    else{
		        left=mid+1;
		    }
		  
		}
		return -1;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
			}
		int k=sc.nextInt();
		
		
		int result=bin_search(a, 0, n-1, k);
		if(result==-1) {
			System.out.println(-1);
		}
		else {
			System.out.println(result);
		}
		
		
	}

}
