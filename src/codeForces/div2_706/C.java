package codeForces.div2_706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.*;


//public class C {
//	
//	static class SScanner {
//
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st=new StringTokenizer("");
//		public String next() {
//			while (!st.hasMoreElements())
//				try {
//					st=new StringTokenizer(br.readLine());
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			return st.nextToken();
//		}
//		int nextInt() {
//			return Integer.parseInt(next());
//		}
//	}
//	static void  sort(int a[]) {
//		ArrayList<Integer> al = new ArrayList<>();
//		for(int i=0;i<a.length;i++) al.add(a[i]);
//		
//		Collections.sort(al);
//		for(int i=0;i<a.length;i++)a[i]=al.get(i);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
class Pair {
    public int x, y;
 
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
 
class C {

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
    public static void findPairs(int[] A)
    {
        Map<Integer, List<Pair> > map = new HashMap<>();
 

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {

                int sum = A[i] + A[j];

                if (map.containsKey(sum)) {

                    for (Pair pair : map.get(sum)) {
                        int x = pair.x;
                        int y = pair.y;

                        if ((x != i && x != j) && (y != i && y != j)) {
                        	System.out.println("YES");
                        	i++;
                        	j++;
                        	x++;
                        	y++;
                            System.out.println( i+ " "
                                               + j+ " "+ x+" " + y);
 
                            return;
                        }
                    }
                }

                map.putIfAbsent(sum, new ArrayList<>());
                map.get(sum).add(new Pair(i, j));
            }
        }
 
        System.out.println("NO");
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        SScanner sc = new SScanner();
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++) A[i]=sc.nextInt();
 
        findPairs(A);
    }
}