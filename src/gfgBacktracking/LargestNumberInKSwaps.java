package gfgBacktracking;

import java.util.Scanner;

public class LargestNumberInKSwaps {
	 static int[] swap(int a[],int i,int j){
	        int temp=a[i];
	        a[i]=a[j];
	        a[j]=temp;
	        
	        return a;
	    }
	 
	 static boolean greater(int a[],int mx[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]>mx[i]) {
				return true;
			}
			if(a[i]<mx[i]) {
				return false;
			}
		}
		return false;
	 }
		
		static void findmx(int a[],int k,int mx[]){
		    if(greater(a,mx)){
		        for(int i=0;i<mx.length;i++) {
		        	mx[i]=a[i];
		        }
		    }
		    
		    if(k==0){
		        return;
		    }
		    
		    for(int i=0;i<a.length-1;i++){
		        for(int j=i+1;j<a.length;j++){
		            if(a[j]>a[i]){
		                swap(a,i,j);
		                findmx(a,k-1,mx);
		                swap(a,i,j);
		            }
		        }
		    }
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    
		    while(t-->0) {
		    	int k=sc.nextInt();
		    	sc.nextLine();
		    	String s=sc.nextLine();
		    	int a[]=new int[s.length()];
		    	int mx[]=new int[s.length()];
		    	for(int i=0;i<s.length();i++) {
		    		mx[i]=a[i]=s.charAt(i)-48;
		    	}
		    	
		    	findmx(a,k,mx);
		    	for(int i=0;i<s.length();i++) {
		    		System.out.print(mx[i]);
		    	}
		    	System.out.println();
		    }
		}

}
