package news;

import java.util.HashSet;
import java.util.Scanner;

public class CodeforcesPerm {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int s = sc.nextInt();
		
		int t = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp=s;
		int cnt=0;
		
		if(s!=t && (t==a[t-1] || s==a[s-1])) {
			System.out.println(-1);
		}
		else {
			while(temp!=t) {
				System.out.println(temp);
				temp=a[temp-1];
				
				cnt++;
			}
			System.out.println(cnt);
		}
		

	}

}
