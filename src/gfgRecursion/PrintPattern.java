package gfgRecursion;

import java.util.Scanner;

public class PrintPattern {

	 static void printDec (int n,int count){
	        count++;
	        if(n<0){
	            System.out.print(n+ " ");
	            printInc(n+5,count);
	            return;
	        }
	        System.out.print(n+ " ");
	    
	        printDec(n-5,count);
	        return;
	    }
	    
	    
	    static void printInc (int n,int count){
	    	count--;
	        if(count==1){
	             System.out.print(n+ " ");
	             return;
	        }
	        System.out.print(n+ " ");
	    
	        printInc(n+5,count);
	        return;
	    }
		public static void main (String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int t=sc.nextInt();
			
			while(t-->0){
			    int n=sc.nextInt();
			    printDec(n,0);
			    System.out.println();
			}
		}

}
