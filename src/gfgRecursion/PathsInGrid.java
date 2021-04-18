package gfgRecursion;

import java.util.Scanner;

public class PathsInGrid {
	static int paths(int n,int m){
        if (n==1||m==1){
            return 1;
        }
        return paths(n,m-1)+ paths(n-1,m);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    System.out.println(paths(n,m));
		}
	}

}
