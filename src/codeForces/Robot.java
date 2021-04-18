package codeForces;

import java.util.Scanner;

public class Robot {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int f = sc.nextInt();
			int s = sc.nextInt();
			int of=f;
			int os=s;
			int min = Math.min(f, s);
			int ans=(2*min);
			f-=min;
			s-=min;
			
			int re=Math.max(of, os)-min;
			if(re>=1) {
				ans++;
				re-=1;
			}
			while(re-->0) {
				ans+=2;
			}
			System.out.println(ans);
		}
	}

}
