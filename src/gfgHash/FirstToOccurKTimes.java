package gfgHash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FirstToOccurKTimes {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			
			
			int min=-1;
		 	Set<Integer> set=new TreeSet<>();
//		 	for(int i=n-1;i>=0;i--) {
//		 		if(set.contains(sc.nextInt())) {
//		 			min=i+1;
//		 		}else {
//		 		set.add(sc.nextInt());
//		 		}
//		 	}
//		
//			System.out.println(min);
			set.add(2);
			set.add(1);
			System.out.println(set.toArray()[0]);
		}

	}

}
