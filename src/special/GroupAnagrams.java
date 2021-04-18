package special;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			String ss[]=new String[n];
			
			for(int i=0;i<n;i++) {
				ss[i]=sc.next();
			}
			
			Map<String,List<String>> map=new HashMap<>();
			for(String s:ss) {
				char c[]=s.toCharArray();
				Arrays.sort(c);
				String sorted=new String (c);
				
				if(!map.containsKey(sorted)) {
					map.put(sorted, new LinkedList<String>());
				}
				map.get(sorted).add(s);
			}
			List<List<String>> ans=new LinkedList<>(map.values());

			int res[]=new int[ans.size()];
			for(int i=0;i<ans.size();i++) {
				res[i]=ans.get(i).size();
			}
			Arrays.sort(res);
			for(int e:res) {
				System.out.print(e+ " ");
			}
			System.out.println();
		}

	}

}
