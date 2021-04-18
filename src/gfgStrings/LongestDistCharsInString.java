package gfgStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LongestDistCharsInString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
			String s= sc.next();
	
			int mx=0;
	        Map<Character,Integer> map= new HashMap<>();
	        for(int i=0;i<s.length();i++) {
	        	int size=0;
	        	char c= s.charAt(i);
	        	if(!map.containsKey(c) || map.get(c)==-1) {
	        		map.put(c, i);
	        	}
	        	else {
	        		int count=map.get(c);
	        		
	        		for(Entry<Character,Integer> e: map.entrySet()) {
	        			if(e.getValue()<count) {
	        				map.replace(e.getKey(), -1);
	        			}
	        		}
	        		
	        		map.put(c,i);
	        	}
	        	for(Entry<Character,Integer> e: map.entrySet()) {
	        		if(e.getValue()>=0) {
	        			size++;
	        		}
	        	}
	        	mx=Math.max(mx, size);
	        }
	        System.out.println(mx);
		}

	}

}
