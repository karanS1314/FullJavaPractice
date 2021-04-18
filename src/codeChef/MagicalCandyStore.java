package codeChef;

import java.util.HashMap;
import java.util.Scanner;

public class MagicalCandyStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=0;
		if(sc.hasNext())t= sc.nextInt();
		while(t-->0) {
			int n=0;
			if(sc.hasNext())n= sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int q=0;
			if(sc.hasNext())q= sc.nextInt();
			while(q-->0) {
				long r=0;
				if(sc.hasNext())r= sc.nextLong();
				HashMap<Integer, Integer> map = new HashMap<>();


				int str =-1;
				for(int i=0;i<n;i++) {
					if(a[i]==1) {
						if(i!=n-1) {
							str=i;
							break;
						}
					}
				}
				
				
				if(str==-1 || r<=str || str==n-1) {//does not contains 1 OR in 4 2 3 1 6 str=3 and if r <=3 means 1 kabhi count mei aaya hi ni
					int fr=(int) (r/n);
					int pr=(int) (r%n);
					long ans=0;
					long sum = 0;
					long prSum = 0;
					for(int i=0;i<n;i++) {
						if(i==n-1) {
							if(a[i]%2==0) {
								sum+=a[i]-1;
								sum%=1000000007;
							}
							else {
								sum+=a[i];
								sum%=1000000007;
							}
						}
						else {
							if(a[i]%2==0) {
								sum+=a[i];
								sum%=1000000007;
							}
							else {
								sum+=a[i]-1;
								sum%=1000000007;
							}
						}
						if(i==pr-1) {
							prSum=sum;
						}
					}
					sum%=1000000007;
					prSum%=1000000007;
					ans=(prSum+(fr*sum)%1000000007)%1000000007;
					if(pr==0 && a[n-1]%2==0) {
						ans++;
						ans%=1000000007;
					}
					else if(pr>0 && a[(pr-1)]%2!=0) {
						ans++;
						ans%=1000000007;
					}
					System.out.println(ans%1000000007 );
				}
				else if(str==0) {
					int res=0;
					for(int i=0;i<r;i+=n+1) {
						res++;
					}
					System.out.println(res);
				}
				else {
					int isum = 0; 
					for(int i=0;i<str;i++) {
						if(a[i]%2==0) {
							isum+=a[i];
						}
						else {
							isum+=a[i]-1;
						}
						isum%=1000000007;
					}
					isum++;
					isum%=1000000007;	
					
					r=r-str-1;
					int fr=(int) (r/n);
					int pr=(int) (r%n);
					if(fr/2==0 && pr==0) {// bs isum hi answer hai
						System.out.println(isum);
					}
					else {
						int psum=0;
						if(fr%2!=0) {
							int l = str+1;
							for(int i=0;i<pr;i++) {
								int m=a[(l+i)%n];
								if((l+i)==n-1) {
									if(m%2==0) {
										psum+=m-1;
										if(i==pr-1) {
											psum++;
										}
							    	}
									else {
										psum+=m;
									}
								}
								else if(m%2==0) {
									psum+=m;
								}
								else {
									psum+=m-1;
									if(i==pr-1) {
										psum++;
									}
								}
								psum%=1000000007;
							}
							psum%=1000000007;
						}
						int tsum=0;
						if(fr/2>0) {
							for(int i=0;i<n;i++) {
								if(i==n-1) {
									if(a[i]%2==0) {
										tsum+=a[i]-1;
									}
									else {
										tsum+=a[i];
									}
								}
								else {
									if(a[i]%2==0) {
										tsum+=a[i];
									}
									else {
										tsum+=a[i]-1;
								    }
						    	}
								tsum%=1000000007;
					    	}
							tsum++;
						}
						tsum%=1000000007;
						int ans=0;
						ans+=(((fr/2)*tsum)%1000000007+psum+isum)%1000000007;
						System.out.println(ans);
					}		
				}		
			}	
		}

	
	}
}
