package gfgRecursion;

import java.util.Scanner;

public class TowerOfHanoi {
	
	 static int count=0;
	    static void toh(int s,int h, int d, int n){
	        count++;
	        if(n==1){
	            System.out.println("move disk " +n+ " from rod "+ s+ " to rod "+ d);
	            return;
	        }
	        toh(s,d,h,n-1);
	         System.out.println("move disk " +n+ " from rod "+ s+ " to rod " +d);
	         toh(h,s,d,n-1);
	    }
		public static void main (String[] args) {
			Scanner sc=new Scanner (System.in);
			int t=sc.nextInt();
			while(t-->0){
			    int  n=sc.nextInt();
			    int s=1;
			    int h=2;
			    int d=3;
			    toh(s,h,d,n);
			    System.out.println(count);
			    count=0;
			}
		}
	

}
