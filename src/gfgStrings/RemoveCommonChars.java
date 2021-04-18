package gfgStrings;

import java.util.Scanner;

public class RemoveCommonChars {

	public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int t=sc.nextInt();
       
       while(t-->0) {
    	  String s1=sc.nextLine();
    	  sc.nextLine();
    	  String s2=sc.nextLine();
           
           int s1l[]=new int[256];
           int s2l[]=new int[256]; 
           
           for(char d:s1.toCharArray()) {
        	   int index=(int)d;
        	   s1l[index]++;
           }
           
           for(char e:s2.toCharArray()) {
        	   int index=(int)e;
        	   s2l[index]++;
           }
           
           for(int i=0;i<256;i++) {
        	   if(s1l[i]>0 && s2l[i]>0) {
        		   s1l[i]=0;
        		   s2l[i]=0;
        	   }
           }
            
           for(int i=0;i<256;i++) {
        	   if(s1l[i]>0) {
        		   System.out.print(s1);
        	   }
           }
           for(int i=0;i<256;i++) {
        	   if(s2l[i]>0) {
        		   System.out.print(s2l[i]);
        	   }
           }
       
       
       }

	}

}
