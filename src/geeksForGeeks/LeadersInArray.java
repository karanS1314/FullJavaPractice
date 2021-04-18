package geeksForGeeks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		    ArrayDeque<Integer> ans=new ArrayDeque<>();
		    int n=sc.nextInt();
		    ArrayDeque<Integer> ad=new ArrayDeque<>();
		    for(int i=0;i<n;i++){
		        int m=sc.nextInt();
		        ad.push(m);
		    }
		    int max=0;
		    while(!ad.isEmpty()){
		        int m=ad.pop();
		        if(m>=max){
		            ans.push(m);
		        }
		        max=Math.max(max,m);
		    }
		    while(!ans.isEmpty()){
		        System.out.print(ans.poll()+" ");
		    }
		    System.out.println();
		}
	}

}
