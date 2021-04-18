package geeksForGeeks;

import java.util.Scanner;

public class LastIndexOf1 {

	public static void main(String[] args) {
	    
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			String s=sc.next();
			int ans=-1;
			
			for(int i=s.length()-1;i>=0;i--) {
				if(s.charAt(i)=='1') {
					ans=i;
					break;
				}
				
			}
			System.out.println(ans);
		}
		
		
	}

}
