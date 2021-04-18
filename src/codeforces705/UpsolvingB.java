package codeforces705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UpsolvingB {
	
	static class SScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
	
	static boolean valid(String s, int j) {

		StringBuffer x = new StringBuffer("");
		
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='5') {
				x.append("2");
			}
			else if(s.charAt(i)=='2') {
				x.append("5");
			}
			else if(s.charAt(i)=='0'|| s.charAt(i)=='1'|| s.charAt(i)=='8') {
				x.append(s.charAt(i));
			}
			else {
				return false;
			}
		}
		int z=Integer.parseInt(x.toString());
		if(s.length()<2) {
			z*=10;
		}
		if(z<j) {
//			System.out.println(Integer.parseInt(x.toString()));
			return true;
		}
		
		return false;
	}


	public static void main(String[] args) {
		SScanner sc = new SScanner ();
		int t = sc.nextInt();
		while(t-->0) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			
			String s = sc.next();
			
			String sa[] = s.split(":");
			
			int x = Integer.parseInt(sa[0]);
			int y = Integer.parseInt(sa[1]);
			
			//x -- bahar vala and rev of x <m
			
			//
		
			boolean found=false;
			
			if(valid(String.valueOf(x),m)) {
				 
				while(y<m) {
					if(valid(String.valueOf(y),h)) {
						found=true;
						break;
					} 
					y++;
				}
				
			}else {
				y=0;
			}
			//
//			05:23___05:59
			
			if(!found) {
				y=0;
				for(int i=0;i<h-1;i++) {
					x++;
//					System.out.println(x);
					x%=h;
					if(valid(String.valueOf(x),m)) {
						for(int j=0;j<m;j++) {
							if(valid(String.valueOf(y),h)) {
//								System.out.println(y+ "-1");
								found=true;
								break;
							}
							y++;
							y%=m;
						}
					}
					if(found) break;
				}
			}
			
			if(x<10) {
				System.out.print("0");
			}
			System.out.print(x+ ":");
			if(y<10) {
				System.out.print("0");
			}
			System.out.print(y);
			System.out.println();
		}

	}

}
