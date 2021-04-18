package gfgRecursion;

import java.util.Scanner;

public class HelpOldMan {

	static int count=0;
    static void toh(int s,int h,int d,int N,int n){
        if(N==0){
            return;
        }
        toh(s,d,h,N-1,n);
        count++;
        if(count==n){
            System.out.println(s+ " "+ d);
        }
        toh(h,s,d,N-1,n);
        return;
    }
	public static void main (String[] args) {
	      Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t-->0){
	          int N=sc.nextInt();
	          int n=sc.nextInt();
	          toh(1,2,3,N,n);
	          count =0;
	      }
	}

}
