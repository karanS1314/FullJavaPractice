package gfgHash;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstUniqueElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			HashMap<Integer,Integer> map=new HashMap<>();
			for(int i=0;i<n;i++) {
				int m=sc.nextInt();
				if(!map.containsKey(m)) {
					map.put(m,0);
				}
				else {
					map.put(m,1);
				}
			}
			
			for(Entry<Integer,Integer> e:map.entrySet()) {
				if(e.getValue()==0) {
					System.out.println(e.getKey());
					break;
				}
			}
			
		}

	}

}
