package gfgHash;

import java.util.Arrays;
import java.util.Scanner;

public class TripletsWith0Sum {

	static boolean checkDuo(int a[],int x,int n,int d){
		boolean present=false;
		int i=d+1;
		int j=n-1;
		while(i<j) {
			if(a[i]+a[j]<x) {
				i++;
			}
			else if(a[i]+a[j]>x) {
				j--;
			}
			else if(a[i]+a[j]==x) {
				present=true;
				break;
			}
		}
		return present;
	}
	public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       
       while(t-->0) {
    	   int n=sc.nextInt();
    	   int a[]=new int[n];
    	   
    	   for(int i=0;i<n;i++) {
    		   a[i]=sc.nextInt();
    	   }
    	   
    	   Arrays.sort(a);
    	   boolean ans=false;
    	   for(int i=0;i<n;i++) {
    		   if(checkDuo(a,-a[i],n,i)) {
    			   ans=true;
    			   break;
    		   }
    	   }
    	   if(ans) {
    		   System.out.println(1);
    	   }
    	   else {
    		   System.out.println(0);
    	   }
       }

	}

}
