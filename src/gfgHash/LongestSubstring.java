package gfgHash;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class LongestSubstring {


		// TODO Auto-generated method stub
		public static void main (String[] args) {
			//code
			Scanner sc = new Scanner(System.in);
		    int t=sc.nextInt();
		    sc.nextLine();
		    while(t-->0){
		        String s = sc.nextLine();
		   
		        int len=0;
		        int mx=0;
		        int count=0;
		        int m=0;
		        HashMap<Character,Integer> map=new HashMap<>();
		        for(int i=0;i<s.length();i++){
		            char c=s.charAt(i);
		            if(!map.containsKey(c)){
		                map.put(c,-1);
		            }
		            count=map.get(c);
		           
		            if(count!=-1){
		                len=0;
		                 m=Math.max(map.get(c),m);
		                
		                map.put(c,i);
		                
		            for(Entry<Character,Integer> e: map.entrySet()){
		                   if(e.getValue()>m){
		                   	len++; 	
						   }
		             }
		                
		            
		            }
		            else{
		               map.put(c,i);
		                len++;
		            }
		           
		            mx=Math.max(mx,len);
		            
		        }
		        System.out.println(mx);
		        
		    }
		}
}
