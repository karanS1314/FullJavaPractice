package gfgHash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			
			String s=sc.next();
			int count=0;
			Map<Character,Integer> map=new HashMap<>();
			for(int i=0;i<s.length();i++) {
				if(!map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), 0);
				}
				count=map.get(s.charAt(i));
				count++;
				map.put(s.charAt(i), count);
			}
			char res='0';
			for(int i=0;i<map.values().size();i++) {
				if(map.get(s.charAt(i))>1) {
					res=s.charAt(i);
					break;
				}
			}
			if(res=='0') {
				System.out.println(-1);
			}
			else {
				System.out.println(res);
			}
			
			
		}

	}

}
