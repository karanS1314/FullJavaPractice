package gfgRecursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubsquencesWithKlength {
	
	static int sum=0;
	static void divideAndSum(ArrayList<Integer> p, Set<Integer> set,  int a[], int n) {
		Collections.sort(p);
		
		ArrayList<Integer> q = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(!set.contains(i)) {
				q.add(a[i]);
			}
		}
		
        Collections.sort(q);
        Collections.reverse(q);
        
        
        for(int i=0;i<q.size();i++) {
        	sum+=Math.abs(q.get(i)-p.get(i))%998244353;
        	sum%=998244353;
        }
		
	}
	
	static void sub(int start,int l, int a[],ArrayList<Integer> al,Set<Integer> set,int n) {
		if(al.size()==l) {
			divideAndSum(al,set,a,n);
		}
		
		for(int i=start;i<a.length;i++) {
			al.add(a[i]);
			set.add(i);
			sub(i+1,l,a,al,set,n);
			set.remove(i);
			al.remove(al.size()-1);
		}
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			int l = sc.nextInt();
			int n =2*l;//n is an even number
			int a[] = new int [n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			ArrayList<Integer> al = new ArrayList<>();
			Set<Integer> set = new HashSet<>();
			ArrayList<Integer> q = new ArrayList<>();
			sub(0,l,a,al,set,n);
			
			System.out.println(sum);
			sum=0;
		
	}

}
