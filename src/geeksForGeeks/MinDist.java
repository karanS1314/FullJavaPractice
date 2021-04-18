package geeksForGeeks;

import java.util.Scanner;

public class MinDist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int j=0;j<n;j++) {
			a[j]=sc.nextInt();
			}
		int x=sc.nextInt();
		int y=sc.nextInt();
		int min_dis=Integer.MAX_VALUE;
		int temp=-1;
		for(int i=0;i<n;i++) {
			if(a[i]==x|| a[i]==y) {
				temp=i;
				break;
			}
		}
		 if(temp==-1) {
			 System.out.println(-1);
		 }
		 else {
		for(int i=temp+1;i<n;i++) {
			if(a[i]==x|| a[i]==y ) {
				if( a[i]!=a[temp] && (i-temp)<min_dis)
				{min_dis=i-temp;
				temp=i;}
			    else {
				temp=i;
			    }
		}
		
		 }
		if(min_dis==Integer.MAX_VALUE) {
		System.out.println(-1);
		}else
		{
			System.out.println(min_dis);
		}
		}

}
}