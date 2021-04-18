package codeforces705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;




public class A {
	
	static boolean valid(String s, int j ,HashSet<Integer> set) {
		
		StringBuffer x=new StringBuffer("");
		for(int i=s.length()-1;i>=0;i--) {
			
			if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='5'||s.charAt(i)=='8') {
				if(s.charAt(i)=='5') {
					x.append("2");
				}
				if(s.charAt(i)=='2') {
					x.append("5");
				}
				else {
					x.append(s.charAt(i));
				}
			}
			else {
				return false;
			}
		}
		
		if(Integer.parseInt(x.toString())<j) {
			return true;
		}
		return false;
	}
	
	
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

	public static void main(String[] args) {
		SScanner sc = new SScanner();
		int t = sc.nextInt();
		while(t-->0) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			
			String s = sc.next();
			
			
			HashSet<Integer> set = new HashSet<>();
			set.add(49);
			set.add(50);
			set.add(48);
			set.add(53);
			set.add(56);
			
			
			int a[] = {0,1,2,5,8};
			
			String sa[] = s.split(":");
			
			
			int one=0;
			int sec=0;
			int x1=Integer.parseInt(sa[0]);
			int x2=Integer.parseInt(sa[1]);
			
//			System.out.println(x1+ " "+x2);
			boolean found=false;
			
			while(one<h && found==false) {
				
				boolean outer=valid(String.valueOf(x2),h,set);
				
				if(outer) {
					while(sec<m) {
						boolean inner=valid(String.valueOf(x1),m,set);
						if(inner&& outer) {
							found=true;
							break;
						}
						sec++;
						x1++;
						x1%=h;
					}
				}
				else {
					
					one++;
					x2++;
					x2%=m;
				}
				if(found) {
					break;
				}

			}
			
			StringBuffer ans= new StringBuffer("");
			if(x1<10) {
				ans.append("0");
			}
			ans.append(x1);
			ans.append(":");
			if(x2<10) {
				ans.append("0");
			}
			ans.append(x2);
			
			System.out.println(ans);
			
			
			
			
		}

	}

}
