package codeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DivideandSum {
	
	
	static int sum=0;
	static Set<Integer> set = new HashSet<>();
	static void addd(int a[], int size,ArrayList<Integer>p, ArrayList<Integer>q) {
		for(int i=0;i<size;i++) {
			p.add(a[i]);
			set.add(a[i]);
		}
		Collections.sort(p);
		for(int i=0;i<a.length;i++) {
			if(!set.contains(a[i])) {
				q.add(a[i]);
			}
		}
		set.clear();
		Collections.sort(q);
		Collections.reverse(q);
		for(int i=0;i<q.size();i++) {
			System.out.println(p.get(i));
			System.out.println(q.get(i));
//			sum+=Math.abs(p.get(i)-q.get(i))%998244353;
		}
		
		p.clear();
		q.clear();
		
	}
	
	static void printSequencesRecur(int a[], int n, int k, int index,ArrayList<Integer>p,ArrayList<Integer>q )  
	{  
	int i;  
	if (k == 0)  
	{  
	    addd(a,index,p,q)  ;
	}  
	if (k > 0)  
	{  
	    for(i = 1; i<=n; ++i)  
	    {  
	        a[index] = i;  
	        printSequencesRecur(a, n, k-1, index+1,p,q);  
	    }  
	}  
	}  

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();
	    int a[] = new int[2*n];
	    for(int i=0;i<2*n;i++) {
	    	a[i]=sc.nextInt();
	    }
	    
	    ArrayList<Integer> p= new ArrayList<>();
	    
	    ArrayList<Integer> q= new ArrayList<>();
	    
	    printSequencesRecur(a,2*n,n,0,p,q);
//	    System.out.println(sum);
	    sum=0;

	}

}
