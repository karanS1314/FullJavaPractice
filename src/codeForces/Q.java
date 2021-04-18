package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Q {

	  public static void main(String []args){
	       Scanner sc = new Scanner(System.in);
	       
	       int n = sc.nextInt();
	       
	       int q = sc.nextInt();
	       
	       int a[] = new int[n];
	       
	       int cnt =0;
	       for(int i=0;i<n;i++){
	           a[i]=sc.nextInt();
	           if(a[i]==1) cnt++;
	       }
	       
	       while(q-->0){
	           int t = sc.nextInt();
	           int m = sc.nextInt();
	           
	           if(t==1){
	        	   if(a[m-1]==1) {
	        		   cnt--;
	        	   }else {
	        		   cnt++;
	        	   }
	               a[m-1]=1-a[m-1];
	           }
	           else if(t==2){
	               if(m<=cnt) {
	            	   System.out.println(1);
	               }
	               else {
	            	   System.out.println(0);
	               }
	           }
	           
	       }
	       
	     }

}
