package gfgRecursion;

import java.util.ArrayList;

public class SortArray {
	
	static void srt(int a[],int n,ArrayList<Integer> al) {
		if(n==0) {
			return;
		}
		srt(a,n-1,al);
//		boolean check=false;
//		for(int i=0;i<n-1;i++) {
//			if(a[n-1]<a[i]) {
//				check=true;
//				al.add(i, a[n-1]);
//				break;
//			}
//		}
//		if(!check) al.add(a[n-1]);
		insert(al,al.size(),a[n-1]);
		return;
	}
	static void insert(ArrayList<Integer> al,int nl,int temp) {
		if(nl==0) {
			al.add(0,temp);
			return;
		}
		
		if(temp>al.get(nl-1)) {
			al.add(nl,temp);
			return;
		}
		
		insert(al,nl-1,temp);
		return;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		int a[]= {2,4,3,5,9,1,7};
		int n=a.length;
		srt(a,n,al);
		
		for (int i : al) {
			System.out.print(i+ " ");
		}

	}

}
