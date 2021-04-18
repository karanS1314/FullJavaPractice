package codeForces;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class MaxAbs {
	
	
	

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

	public static void main(String[] args) {
		SScanner sc = new SScanner();
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int sa[] = new int[n-k+1];
		
		int sum=0;
		
		for(int i=0;i<k;i++) {
			sum+=a[i];
		}
		
		int i=0;
		int j=k;
		
		sa[0]=sum;
		for(int tt=1;tt<n-k+1;tt++) {
			sum-=a[i];
			sum+=a[j];
			
			sa[tt]=sum;
			i++;
			j++;
		}
		
		int tf[] = new int[sa.length-1];
		
		for(int l=k;l<sa.length;l++) {
			tf[l-k]=sa[l];
		}
		
		int mxa[]= new int[sa.length-k];
		int mxi[]= new int[mxa.length];
		Deque<Integer> dq=new LinkedList<>();
		
		int l=0;
		for(;l<k;l++) {
			while(!dq.isEmpty() && tf[dq.peekLast()]<tf[l]) {
				dq.removeLast();
			}
			dq.addLast(l);
		}

		for(;l<tf.length;l++) {
			mxi[l-k]=dq.peekFirst();
			mxa[l-k]=tf[dq.peekFirst()];
			
			
			while(!dq.isEmpty() && dq.peekFirst()<=l-k) {
				dq.removeFirst();
			}
			while(!dq.isEmpty() && tf[dq.peekLast()]<tf[l]) {
				dq.removeLast();
			}
			dq.addLast(l);
		}
		mxa[sa.length-k-1]=tf[dq.peekFirst()];
		mxi[sa.length-k-1]=dq.peekFirst();
		
//		for(int e: mxa) {
//			System.out.println(e);
//		}
//
//		for(int e: mxi) {
//			System.out.println(e);
//		}
		
		for(int l=0;l<)

		

	}

}
