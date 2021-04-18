package special;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinary {

	static void binary(int n) {
		Queue<String> q=new LinkedList<>();
		q.add("1");
		String temp2="";
		while(n-->0) {
		   String temp=q.peek();
		   q.poll();
		   System.out.print(temp+ " ");
		   temp2=temp+1;
		   temp=temp+0;
//		   temp2=temp+1;
		   q.offer(temp);
	       q.offer(temp2);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			binary(n);
			System.out.println();
		}

	}

}
