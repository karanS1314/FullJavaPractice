package codeChef;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnusualQueries {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = 0;
		int q = 0;
		int s = 0;
		if(sc.hasNext()) n = sc.nextInt();
		if(sc.hasNext()) q = sc.nextInt();
		if(sc.hasNext()) s = sc.nextInt();
		
		int a[] = new int [n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}

		int last = 0;
		int dp[][]= new int[n][n];

		for(int i=0;i<n;i++) {
			int mx =a[i];
			for(int j=i+1;j<n;j++) {
				if(a[j]>mx) {
					mx=a[j];
		    		dp[i][j]=dp[i][j-1]+1;
				}
				else {
					str.add(a[i]);
					dp[i][j]=dp[i][j-1];
				}
			}
		}
		while(q-->0){
			    int x = 0;
			    int y = 0;
			    if(sc.hasNext()) x = sc.nextInt();
			    if(sc.hasNext()) y = sc.nextInt();
			    
			    int L = (x+s*last-1)%n;
				int R = (y+s*last-1)%n;

			    if(L>R){
			        int tmp = L;
			        L = R;
			        R = tmp;
			    }
			    
			 
			    int mx = 0;
				   for(int i=L;i<=R;i++){
					   mx=Math.max(mx, dp[i][R]);
				   }
	
				    last = mx;
				  
				    System.out.println(last);
			    
		}
	}
}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;i++) {
//				System.out.print(dp[i][j]);
//			}
//			System.out.println();
//		}
	
//	}


