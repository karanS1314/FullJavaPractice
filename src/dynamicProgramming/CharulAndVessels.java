package dynamicProgramming;
import java.util.*;
//import java.lang.*;
//import java.io.*;

public class CharulAndVessels {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int a[]= new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    
		    int dp[]= new int[k+1];
		    dp[0]=1;
		    
		    int rs=0;
		    for(int i=0;i<n;i++){
		        for(int j=a[i];j<=k;j++){
		            dp[j]+=dp[j-a[i]];
		        }
		        if(dp[k]!=0){
		            rs=1;
		            break;
		        }
		    }
		    System.out.println(rs);
		}
	}
}