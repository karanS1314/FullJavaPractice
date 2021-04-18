package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarrayWithSumDivByK {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
			int m=sum%k;
			if(m<0) {
				m=m+k;
			}
			a[i]=m;
		}
		Map<Integer,ArrayList<Integer>> mp=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(!mp.containsKey(a[i])) {
				mp.put(a[i], new ArrayList<>());
				if(a[i]==0) {
					mp.get(a[i]).add(-1);
				}
			}
			mp.get(a[i]).add(i);
		}
		
		int res=0;
		for(int i=0;i<n;i++) {
			int m=mp.get(a[i]).get(mp.get(a[i]).size()-1)-mp.get(a[i]).get(0);
			res=Math.max(res, m);
		}
		System.out.println(res);
		
	}

}
