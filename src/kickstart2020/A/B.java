package kickstart2020.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B {
	
	static class SScanner {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
	}

	
	static class Pair{
		int data;
		int ii;
		int jj;
		
		Pair(int data , int ii , int jj){
			this.data=data;
			this.ii=ii;
			this.jj=jj;
		}
	}
//	
//	static void rec(int sum , int k , int n , int a[][] ,LinkedList<Pair> b, int max , int p) {
//		if(p<0) return;
//		if(max<sum && p==0) {
//			max = sum;
//			System.out.println(max);
//			return;
//		}
//
//		
//		for(int i=0;i<b.size();i++) {
//			int m = b.get(i).data;
//			System.out.println(sum + " " + b.get(i).jj);
//			if(b.get(i).jj<k-1) {
//				b.set(i, new Pair(a[b.get(i).ii][b.get(i).jj+1] ,  b.get(i).ii , b.get(i).jj+1));
//			
//				rec(sum + m , k , n , a , b , max ,p-1);
//			}
//
//		}
//		return;
//		
//	}
	
	static int sol ( int k , int n , int a[][] ,LinkedList<Pair> b, int p) {
		
		if(p<0) return -10000000;
		
		int max =-10000000;

		
		for(int i=0;i<b.size();i++) {
			int sum =0;
			int m = b.get(i).data;
			if(b.get(i).jj<k-1) {
				b.set(i, new Pair(a[b.get(i).ii][b.get(i).jj+1] ,  b.get(i).ii , b.get(i).jj+1));
			}
			else {
				b.remove(i);
			}
			sum=m + sol(k , n , a , b , p-1 );
			if(sum>max) max = sum;
		}
		
		return max;
	}
	public static void main(String[] args) {
		SScanner sc = new SScanner ();
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int p =sc.nextInt();
			int a[][] = new int[n][k];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<k;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			
			LinkedList<Pair> b = new LinkedList<>();
			
			for(int i=0;i<n;i++) {
				b.add(new Pair(a[i][0], i , 0));
			}
			
			int mx = sol(k , n , a , b , p);
			// i m expecting that this will return the max;;
			
			System.out.println(mx);
			
		}

	}

}
