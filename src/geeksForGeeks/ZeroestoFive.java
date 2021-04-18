package geeksForGeeks;

import java.util.Scanner;

public class ZeroestoFive {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0) {
			int n=sc.nextInt();
			System.out.println(function(n) );
	}

}
	static String function(int n) {
		String s=Integer.toString(n);
		return s.replace('0', '5');
		
		
		
	}
	
}
