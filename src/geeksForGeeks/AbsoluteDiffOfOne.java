package geeksForGeeks;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AbsoluteDiffOfOne {
	   static boolean absoluteDiff(long l) {
		   boolean absoluteDiff=true;
		   char current;
		   char next;
		   
		 String s=Long.toString(l); 
		 if(s.length()<2) {
			 absoluteDiff=false;
		 }
		 for(int j=0;j<s.length()-1;j++) {
			 current=s.charAt(j);
			 next=s.charAt(j+1);
			 if(Math.abs(Long.parseLong(Character.toString(current))-Long.parseLong(Character.toString(next)))!=1) {
				 absoluteDiff=false;
				 break;
			 }
		 }
		  return absoluteDiff;
		  }
	   
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) 
		{
			int n=sc.nextInt();
			long a[]=new long[n];
	        long k=sc.nextLong();
	        
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			List<Long> res=new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				if(a[i]<k && absoluteDiff(a[i])) {
					res.add(a[i]);
				}
			}
			if(res.isEmpty()) {
				System.out.print(-1);
			}
			else{
				for(long e:res) {
				System.out.print(e+ " ");
			}
			}
			System.out.println();
			
			
		}
	}

}
