package codeChef;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Fema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=0;
		if(sc.hasNext()) t=sc.nextInt();
		
		while(t-->0) {
			int n1=0;
			if(sc.hasNext()) n1=sc.nextInt();
			int k=0;
			if(sc.hasNext()) k=sc.nextInt();
			k++;
	        sc.nextLine();
	        StringBuffer  sb = new StringBuffer(sc.nextLine());

	        int count = 0;
	        
//	        System.out.println(sb+ " "+sb.length());
	        String sa[]= sb.toString().split("X");
	        
	        for(String s : sa) {
		        	int i = 0;
		 	        int j =	0;
		 	        int n = s.length();
			        while(i<n && j<n) {  	
			            int sheets = 0;
			        	while(s.charAt(i)!='I' && i<n) {
			        		i++;
			        		if(i==n) {
				        		break;
				        	}
			        	}
			        	while(s.charAt(j)!='M' && j<n) {
			        		j++;
			        		if(j==n) {
				        		break;
				        	}
			        	}
			        	if(j==n ||i==n) {
			        		break;
			        	}
			        	for(int e=Math.min(i, j)+1;e<Math.max(i, j);e++) {
			        		if(s.charAt(e)==':') sheets++;
			        	}
			        	int p = k-Math.abs(j-i)-sheets;
			        	if(p>0) {
//			        		System.out.println(i+ " " + j);
			        		count++;
			        		i++;
			        		j++;
			        	}
			        	else if(p<=0) {
			        		if(i>j) {
		//	        			System.out.println(i+ " " + j);
			        			j++;
			        		}
			        		else {
		//	        			System.out.println(i+ " " + j);
			        			i++;
			        		}
			        	}
			        }
	        }
	        System.out.println(count);
	        
		}
	}
}
