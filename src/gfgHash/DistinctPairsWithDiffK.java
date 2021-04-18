package gfgHash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctPairsWithDiffK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
		  int n=sc.nextInt();
		  Set<Integer> set=new HashSet<>();
		  int a[]=new int[n];
		  for(int i=0;i<n;i++) {
			  a[i]=sc.nextInt();
		  }
		  int k=sc.nextInt();
		  int count=0;
		  for(int i=0;i<n;i++){
		      if(k==0){
		          if(set.contains(a[i])&& count==0){
		          count++;
		      }
		      }else{
		      if(set.contains(a[i]-k)){
		          count++;
		      }
		      if(set.contains(a[i]+k)){
		          count++;
		      }}
		      set.add(a[i]);
		  }
		  System.out.println(count);
	}}

}
