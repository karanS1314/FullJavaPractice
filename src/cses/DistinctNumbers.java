package cses;

import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int a[]=new int[n];
	
	for(int j=0;j<n;j++) {
		a[j]=sc.nextInt();
		}
	int c=10^9;
	int b[]=new int[c];
	boolean visited[]=new boolean[c];
	
    for(int e:a) {
    	int index=e;
    	if(!visited[index]) {
    	b[index]++;
    	}
    	visited[index]=true;
    }
   
   
    
    int result=0;
    
    for(int i=0;i<c;i++) {
    	if(b[i]!=0) {
    		 result+=b[i];
    	}
    }
    System.out.println(result);
}
}