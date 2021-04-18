package gfgRecursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Rough{
public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	int t=0;
	if(sc.hasNext()) t = sc.nextInt();
	while(t-->0){
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int a[] = new int[n];
	    int sum = 0;
	    int day =0;
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    
	    for(int i=0;i<n;i++){
	        sum+=a[i]-k;
	        if(sum<0){
	            day=i+1;
	            break;
	        }
	    }
	    if(day!=0){
	        System.out.println(day);
	    }
	    else{
	        while(sum>=k){
	            sum-=k;
	            day++;
	        }
	        System.out.println(day+n+1);
	    }
	     
	}
}}


int mxSum = 0;

int nSum=0;
for(int i=0;i<n;i++) {
	if(i!=n-1) {
		if(a[i]%2==0) {
			nSum+=a[i];
		}
		else {
			if(a[i]==1) {
				nSum+=1;
			}
			else {
				nSum+=a[i]-1;
			}
		}
	}
	else {
		if(a[i]%2==0) {
			nSum+=a[i]-1;
		}
		else {
			nSum+=a[i];
		}
	}
	nSum%=1000000007;
}
int rounds = r/n;
int rdr = r%n;
if(rounds>0) {
	mxSum+=((rounds/2)%1000000007)*(nSum%1000000007))%1000000007;
}
for(int i=1;i<=rdr;i++) {
	if(i==rdr) {
		mxSum+=a[(i-1)%n];
	}
	else if(i%n==0){
		if(a[(i-1)%n]%2==0) {
			mxSum+=a[(i-1)%n]-1;
		}
		else {
			mxSum+=a[(i-1)%n];
		}
	}
	else {
		if(a[(i-1)%n]%2==0) {
			mxSum+=a[(i-1)%n];
		}
		else {
			mxSum+=a[(i-1)%n]-1;
			if(a[(i-1)%n]==1) {
				mxSum+=1;
				break;
			}
		}
	}	
	mxSum%=1000000007;
	if(r==n) {}
//	System.out.print(mxSum+ " ");
}
System.out.println(mxSum%=1000000007);