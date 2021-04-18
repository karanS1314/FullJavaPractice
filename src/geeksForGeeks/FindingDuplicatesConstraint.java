package geeksForGeeks;

import java.util.Scanner;

public class FindingDuplicatesConstraint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int a[]=new int[10];
			for(int i=0;i<10;i++) {
				a[i]=sc.nextInt();
			}
			int res=-1;
			for(int i=0;i<10;i++) {
				if(a[i]==a[i+1]) {
					 res=a[i];
				   break;
				}
			}
			System.out.println(res);
		
			
			}
		}

}
