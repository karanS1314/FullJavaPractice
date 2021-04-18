package gfgHash;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EqualArrays {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			long a[]=new long[n];
			long b[]=new long[n];
			
            for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
            
            for(int i=0;i<n;i++) {
				b[i]=sc.nextLong();
			}
			   
            Map<Long,Integer> map=new HashMap<>();
            
            boolean isEqual=true;
            
            int count=0;
            
			for(int i=0;i<n;i++) {
				if(!map.containsKey(a[i])) {
					map.put(a[i],0);
				}
				count=map.get(a[i]);
				count++;
				map.put(a[i], count);
			}
			
			for(int i=0;i<n;i++) {
				if(!map.containsKey(b[i])) {
					isEqual=false;
					break;
				}
				if(map.get(b[i])==0) {
					isEqual=false;
					break;
				}
				count=map.get(b[i]);
						count--;
						map.put(b[i], count);
				
			}
			
		   if(isEqual) {
			   System.out.println(1);
		   }
		   else {
			   System.out.println(0);
		   }
		}

	}

}
