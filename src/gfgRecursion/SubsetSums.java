package gfgRecursion;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

class GFG {
static int arraySize(int n) {
		if(n==0) {
			return 1;
		}
		return 2*arraySize(n-1);
	}
	 
	    static void sumset(int a[],int n, int ans[]){
	        if(n==0){
	            return;
	        }
	        sumset(a,n-1,ans);
	        for(int i=0;i<arraySize(n-1);i++){
	   
	        	int m=ans[i]+a[n-1];
	            ans[i+arraySize(n-1)]=m;
	        }
	        return;
	    }
	    
	    
	    
		public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			
			while(t-->0){
			    int n=sc.nextInt();
			    int a[]=new int[n];
			    for(int i=0;i<n;i++){
			        a[i]=sc.nextInt();
			    }
			    int l=arraySize(n);
			
			    int ans[]=new int[l];
			    
			    ans[0]=0;
			    sumset(a,n,ans);
			    Arrays.sort(ans);
			    for(int i=0;i<l;i++){
			        System.out.print(ans[i]+ " ");
			    }
			    System.out.println();
			}
		}
}