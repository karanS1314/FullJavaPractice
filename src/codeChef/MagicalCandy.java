package codeChef;

import java.util.Scanner;

public class MagicalCandy {
	static int M = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=0;
		if(sc.hasNext())t= sc.nextInt();
		while(t-->0) {
			int n=0;
			if(sc.hasNext())n= sc.nextInt();
			
			int a[] = new int[n];
			boolean odd=true;
			int str =-1;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				if(a[i]==1) {
					str=i;
				}
				if(a[i]%2==0) {
					odd=false;
				}
			}
			
			int q=0;
			if(sc.hasNext())q= sc.nextInt();
			
			while(q-->0) {	
				long r=0;
				if(sc.hasNext())r= sc.nextLong();
				long ans=0;
				
				if(n==1) {
					if(odd) {
						ans=((r%M)*a[0])%M;
					}
					else {
						ans=((r%M)*(a[0]-1))%M;
						ans++;
					}
				}
				
				else if(n>1){
					if(str==-1 || str==n-1) {  // 1 is not present or present at the last of the array 
						long partialRound=r%n;
						long fullRound=r/n;

						long partialSum=0;
						for(int i=0;i<partialRound;i++) {
							if(a[i]%2==0) {
								partialSum+=a[i]%M;
							}
							else {
								partialSum+=(a[i]-1)%M;
								if(i==partialRound-1) {
									partialSum++;
								}
							}
						}
						partialSum%=M;
						
						long fullSum=0;
						if(fullRound>0) {
							for(int i=0;i<n;i++) {
								if(i==n-1) {
									if(a[i]%2==0) {
										fullSum+=(a[i]-1)%M;
									}
									else {
										fullSum+=(a[i])%M;
									}
								}
								else {
									if(a[i]%2==0) {
										fullSum+=(a[i])%M;
									}
									else {
										fullSum+=(a[i]-1)%M;
									}
								}
							}
						}
						
						ans=(((fullRound%M)*(fullSum%M))%M + partialSum%M)%M;
						if(partialRound==0 && a[n-1]%2==0) {
							ans++;
						}
					}
					else if(str==0) { // 1 is present at the beginning
						for(int i=0;i<r;i+=n+1) {
							ans++;
						}
					}
					else { // 1 is present in the between the array
						long partialRound=r%n;
						long fullRound=r/n;
						
						boolean isOdd=true;
						if(a[str-1]%2==0) {
							isOdd=false;
						}
						
						// fullSum+1 in odd case 
						long partialSum=0;
						for(int i=0;i<partialRound;i++) {
							if(a[i]%2==0) {
								partialSum+=a[i]%M;
							}
							else {
								partialSum+=(a[i]-1)%M;
								if(i==partialRound-1) {
									partialSum++;
								}
							}
						}
						if(partialRound>str+1) {
							if(!isOdd) {
								partialSum--;
							}
						}
//						else if(partialRound==str+1) {
//							partialSum++;
//						}
						
						long fullSum=0;
						if(fullRound>0) {
							for(int i=0;i<n;i++) {
								if(i==n-1) {
									if(a[i]%2==0) {
										fullSum+=(a[i]-1)%M;
									}
									else {
										fullSum+=(a[i])%M;
									}
								}
								else {
									if(a[i]%2==0) {
										fullSum+=(a[i])%M;
									}
									else {
										fullSum+=(a[i]-1)%M;
									}
								}
							}
						}
						if(!isOdd) {
							fullSum-=1;
						}
						ans=(((fullRound%M)*(fullSum%M))%M + partialSum%M)%M;
						if(partialRound==0 && a[n-1]%2==0) {
							ans++;
						}
					}		
				}
				
				System.out.println(ans);
			}
		}

	}

}
