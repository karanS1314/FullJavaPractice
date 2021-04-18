package gfgHash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int n3=sc.nextInt();
			
			long a[]=new long[n1];
			long b[]=new long[n2];
			long c[]=new long[n3];
			
            for(int i=0;i<n1;i++) {
				a[i]=sc.nextLong();
			}
            
            for(int i=0;i<n2;i++) {
				b[i]=sc.nextLong();
			}
            
            for(int i=0;i<n3;i++) {
				c[i]=sc.nextLong();
			}
		
			 Map<Long,Integer> map=new HashMap<>();
	           int count=0;
			 for(int i=0;i<n1;i++) {
	    			if(!map.containsKey(a[i])) {
	    				map.put(a[i],1);
	    			}
	    		}
	            
	            for(int i=0;i<n2;i++) {
	    			if(map.containsKey(b[i])) {
	    			
	    			count=map.get(b[i]);
	    			count=2;
	    			map.put(b[i], count);
	    			}
	    		}
	            
	            for(int i=0;i<n3;i++) {
	    			if(map.containsKey(c[i]) && map.get(c[i])==2) {
	    			
	    				count=map.get(c[i]);
		    			count=3;
		    			map.put(c[i], count);
	    			}
	    		}
	           
	            Set<Long> ans=new TreeSet<>();
	            for(int i=0;i<n3;i++) {
	            	if(map.containsKey(c[i])&&map.get(c[i])==3) {
	            	
	            		ans.add(c[i]);
	            	}
	            }
	            if(ans.size()==0) {
	            	System.out.println(-1);
	            }
	            else {
	            	for(int i=0;i<ans.size();i++) {
	            		System.out.print(ans.toArray()[i] + " ");
	            	}
	            	System.out.println();
	            }
		}

	}

}
