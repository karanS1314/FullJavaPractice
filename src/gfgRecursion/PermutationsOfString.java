package gfgRecursion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PermutationsOfString {
	static TreeSet<String> set=new TreeSet<>();

	 static String interchange(String s,int a, int b){
	        char c[]=s.toCharArray();
	        char temp=c[a];
	        c[a]=c[b];
	        c[b]=temp;
	        return String.valueOf(c);
	    }
	 
	     static void permutations(String s,int l,int r){
		        if(l==r){
	 	            if(set.contains(s)){
	 	               return;
	 	            }
	 	            set.add(s)            ;
//		            System.out.print(s+ " ");
//		        	System.out.println(s);
		            return;
		        }
		        for(int i=l;i<=r;i++){
		           s= interchange(s,l,i);
		            permutations(s,l+1,r);
		           s=interchange(s,l,i);
		        }
		    }
		public static void main (String[] args) {
		  Scanner sc=new Scanner (System.in);
		  int t=sc.nextInt();
		 
		  while(t-->0){
		      String s=sc.next();
		      permutations(s,0,s.length()-1);
			 
		      for(int i=0;i<set.size();i++) {
		    	  System.out.print(set.toArray()[i]+ " ");
		      }
		      set.clear();
		      System.out.println();
		  }
		}
}
