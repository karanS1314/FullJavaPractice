package dynamicProgramming;

import java.util.Scanner;

public class SumOfSubstrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t =sc.nextInt();
		sc.nextLine();
		
		while(t-->0){
		    String s = sc.nextLine();
            int n = s.length();
            int sum=0;
            for(int i=0;i<n;i++){
                int j=0;
                int k=j+i;
                while(k<n){
                    sum+=Integer.parseInt(s.substring(j,k+1));
                    j++;
                    k++;
                }
            }
		    System.out.println(sum);
		}
	}

}
