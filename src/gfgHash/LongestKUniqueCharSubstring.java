package gfgHash;


import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class LongestKUniqueCharSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
		    String s=sc.next();
		    int k=sc.nextInt();
		    if(k==1) {
		    	System.out.println(1);
		    }
		    else {
		    int count =0;
		    int mx=-1;
		    HashMap<Character,Integer> map=new HashMap<>();
		    for(int i=0;i<s.length();i++){
		        char c=s.charAt(i);
		        if(!map.containsKey(c)){
		            map.put(c,0);
		        }
		        count = map.get(c);
		        count++;
		        int ans=0;
		        int sum=0;
		        map.put(c,count);
		        
		        for(Entry<Character,Integer> e: map.entrySet()) {
		        	if(e.getValue()>0) {
		        		sum+=1;
		        	}
		        	ans+=e.getValue();
		        }
		        if(sum>k){
		            while(sum!=k){
		            count=map.get(s.charAt(i+1-ans));
		            ans--;
		            count--;
		            if(count==0) sum--;
		            map.put(s.charAt(i+1-ans),count);
		            }
		            mx=Math.max(mx, ans);
		        }
		        
		        else if(sum==k) {
		        	mx=Math.max(mx, ans);
		        }
		       
		    }
//		    System.out.println(map.values());
//		    System.out.println(mx);
		    if(mx==0) {
		    	System.out.println(-1);
		    }
		    else {
		    	System.out.println(mx);
		    }
		    }
		}
	}

}
