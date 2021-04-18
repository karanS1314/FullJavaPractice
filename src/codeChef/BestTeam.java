package codeChef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BestTeam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			long c=sc.nextLong();
			ArrayList<Integer> s=new ArrayList<>();
			ArrayList<Integer> p=new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				s.add(sc.nextInt());
				p.add(sc.nextInt());
			}
			
//			int e=s[i]/p[i];
			int cost=0;
			int answer=0;
			while(!s.isEmpty()) {
				int res=0;
				int index=-1;
				for(int i=0;i<s.size();i++) {
					 int e=(s.get(i)/p.get(i));
					res=Math.max(res, e);
					if(res==e) {
						index=i;
					}
				}
				
				
				if(cost+p.get(index)<c) {
					cost+=p.get(index);
					answer+=s.get(index);
					p.remove(index);
					s.remove(index);
				}
				else {
					p.remove(index);
					s.remove(index);
				}
				
			}
			System.out.println(answer);
			
			
		}

	}

}
