package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MinCoinChange {

	static int minCoins(int coins[], int m, int n, int dp[]) {
		
		if(n==0) return 0;
		
		int ans= Integer.MAX_VALUE;
		for(int i=0;i<m;i++) {
			if(n-coins[i]>=0) {
				int subAns=0;
				if(dp[n-coins[i]]!=-1) {
					subAns=dp[n-coins[i]];
				}
				else {
					subAns= minCoins(coins,m,n-coins[i],dp);
				}
				if(subAns!=Integer.MAX_VALUE && subAns+1<ans) {
					ans= subAns+1;
				}
			}
		}
		return dp[n]=ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int coins[]= new int[m];
			for(int i=0;i<m;i++) {
				coins[i] = sc.nextInt();
			}
			int dp[]= new int[n+1];
			Arrays.fill(dp, -1);
			dp[0]=0;
			
			System.out.println(minCoins(coins,m,n,dp));
		}
	}

}
