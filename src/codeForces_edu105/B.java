package codeForces_edu105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

class FastScanner {
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

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			
			int a[] = new int[4];
			for(int i=0;i<4;i++) {
				a[i]=sc.nextInt();
			}
			
			
			HashSet<Integer> set = new HashSet<>();
			if(n>2) {
				for(int i=0;i<4;i++) {
					if(a[i]>n-2) {
						set.add(i);
						a[i]-=n-2;
					}
				}
			}
			
				boolean f =true;
				for(int i=0;i<4;i++) {
					if(set.contains(i) || n==2) {

						int m = (i-1);
						if(m<0) m=3;
						
						
						if(a[i]==0) continue;
						
						else if(a[i]==1) {
							if(a[m]>a[(i+1)%4]) {
								a[m]--;
							}
							else {
								a[(i+1)%4]--;
							}
						}
						
						else if(a[i]==2) {
							a[m]--;
							a[(i+1)%4]--;
						}
						if(a[m]<0 || a[(i+1)%4]<0) {
							f=false;
							break;
						}else {
							a[i]=0;
						}
					}
				}
				
				if(f) {
					for(int i=0;i<4;i++) {
						if(a[i]<0 || a[i]>n-2) {
							f=false;
						}
					}
				}
				if(f) System.out.println("YES");
				else System.out.println("NO");
			
	
		}

	}

}
