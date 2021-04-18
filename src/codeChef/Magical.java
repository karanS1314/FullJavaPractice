package codeChef;

import java.io.*; 
public class Magical {

	static int mod = 1000000007;
	public static void main(String[] args) throws Exception {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	    int t= Integer.parseInt(br.readLine());
		while(t-->0) {
			int n= Integer.parseInt(br.readLine());
			int a[]= new int[n];
			int l = 0;
			int s =-1;
			String[] sa = br.readLine().split(" ");
			for(int i=0;i<n;i++) {
				a[i]=Integer.parseInt(sa[i]);
				if(a[i]==1) {
					if(i==0) {
						l=1;
					}
					else if(i!=n-1) {
						l=2;
						s=i;
					}
				}
			}
			if(l==1) {
				int q= Integer.parseInt(br.readLine());
				while(q-->0) {
					long r= Long.parseLong(br.readLine());
					long ans;
					if(r%n==0){
						ans= ((r/n) % mod);
					}
					else{
						if(r%n==1 && r>n ){
							ans= ((r/n) % mod);
						}
						else{
					    	ans= ((r/n+1) % mod);
						}
					}
					System.out.println(ans);
				}
			}
			else if(l==2) {
				long sum=0;
				long arr[] = new long[100000];
				for(int i=0;i<n-1;i++){
					if(i==s-1){
						if(a[i]%2==0){
							sum=sum+a[i]-1;
							arr[i]=sum;
						}
						else{
							sum+=a[i];
							arr[i]=sum;
						}
					}
					else{
						if(a[i]%2==0){
							sum+=a[i];
							arr[i]=sum;
						}
						else{
							sum+=a[i]-1;
							arr[i]=sum;
						}
					}
				}
				if(a[(n-1)]%2==0){
					sum+=a[(n-1)]-1;
				}
				else{
			    	sum+=a[(n-1)];
				}
				int q= Integer.parseInt(br.readLine());
				while(q-->0) {
					long r= Long.parseLong(br.readLine());
					if(r%n==0){
						if(a[(int) (n-1)]%2==0){
							System.out.print(((r/n)*sum+1) % mod);
						}
						else{
							System.out.print(((r/n)*sum) % mod);
						}
					}
					else{
						if(s==r%n-1){
							if(a[s-1]%2==0){
								System.out.print(((r/n)*sum+2+arr[(int) (r%n-1)]) % mod);
							}
							else{
								System.out.print(((r/n)*sum+arr[(int) (r%n-1)]) % mod);
							}
						}
						else if(s-1==r%n-1){
							if(a[s-1]%2==0){
								System.out.print(((r/n)*sum+arr[(int) (r%n-1)]+1) % mod);
							}
							else{
								System.out.print(((r/n)*sum+arr[(int) (r%n-1)]) % mod);
							}
						}
						else{
							if(a[(int) (r%n-1)]%2!=0){
								System.out.print(((r/n)*sum+arr[(int) (r%n-1)]+1) % mod);
							}
							else{
								System.out.print(((r/n)*sum+arr[(int) (r%n-1)]) % mod);
							}
						}
					}
					System.out.println();
				}
			}
			else {
				long sum = 0;
				long[] arr = new long[100000];
				for(int i=0;i<n-1;i++){
					if(a[i]%2==0){
						sum+=a[i];
						arr[i]=sum;
					}
					else{
						sum+=a[i]-1;
						arr[i]=sum;
					}
				}
				if(a[n-1]%2==0){
					sum+=a[n-1]-1;
				}
				else{
					sum=sum+=a[n-1];
				}
				int q= Integer.parseInt(br.readLine());
				while(q-->0){
					long r= Long.parseLong(br.readLine());
					if(r%n==0){
						if(a[n-1]%2==0){
							System.out.print(((r/n)*sum+1) % mod);
						}
						else{
							System.out.print(((r/n)*sum) % mod);
						}
					}
					else{
						if(a[(int) (r%n-1)]%2!=0){
							System.out.print(((r/n)*sum+arr[(int) (r%n-1)]+1) % mod);
						}
						else{
							System.out.print((((r/n)*sum+arr[(int) (r%n-1)]) % mod)+1-1);
						}
					}
					System.out.println();
				}
			}

		}
	}
}
