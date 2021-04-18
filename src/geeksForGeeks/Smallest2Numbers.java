package geeksForGeeks;
import java.util.*;

public class Smallest2Numbers {
	static int remove_duplicate(int a[],int n) {
		if(n==0||n==1) {
			return n;
			
		}
		
	    
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
			temp[j++]=a[i];	
			}
		
			
		}
		
		temp[j++]=a[n-1];
		
		
		
		for(int i=0;i<j;i++) {
			a[i]=temp[i];
		}
		return j;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) 
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			n=remove_duplicate(a, n);
			
			
			
			if(n<2) {
				System.out.println(-1);
			}
			
			else {
				System.out.println(a[0]+ " "+ a[1]);
			}
	}

}}
