package gfgRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GFSeries {

	static ArrayList<Long> a=new ArrayList<>();
    static ArrayList<Long> gf(int n){
        if(n==2){
            a.add((long) 0);
            a.add((long) 1);
        }
        else {
        gf(n-1);
        a.add((long)((a.get(n-3))*(a.get(n-3))-(a.get(n-2))));
        }
            return a;
        
    }
	public static void main (String[] args) {
	
	     Scanner sc=new Scanner (System.in);
	     int t=sc.nextInt();
	     
	     while(t-->0){
	         int n=sc.nextInt();
	         if(n==1) {
	        	 System.out.print(0);
	         }
	         else {
	        	 gf(n);
	         for(int i=0;i<a.size();i++){
	             System.out.print(a.get(i)+ " ");
	         }
	         }
	         System.out.println();
	         a.clear();
	     }
	}

}
