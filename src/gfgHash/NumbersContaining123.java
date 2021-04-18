package gfgHash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumbersContaining123 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    Set<Character> set=new HashSet<>();
		    set.add('1');
		    set.add('2');
		    set.add('3');
		    int count=0;
		    Arrays.sort(a);
		    for(int i=0;i<n;i++) {
		    	boolean correct=true;
		    	String s=Integer.toString(a[i]);
		    	for(int j=0;j<s.length();j++) {
		    		if(!set.contains(s.charAt(j))) {
		    			correct=false;
		    			break;
		    		}
		    	}
		    	if(correct) {
		    		count=1;
		    		System.out.print(a[i]+ " ");
		    	}
		    }
		    
		    if(count==0) {
		    	System.out.print(-1);
		    }
		    System.out.println();
		    
		}
	}

}
