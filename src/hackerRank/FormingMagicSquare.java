package hackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class FormingMagicSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = 3;
		int a[][] = new int[n][n];
		int b[] = new int[10];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
				b[a[i][j]]++;
			}
		}
		PriorityQueue<Integer> al1 = new PriorityQueue<>();
		PriorityQueue<Integer> al2 = new PriorityQueue<>();
		for(int i=1;i<10;i++) {
			if(b[i]>1) {
				al1.add(i);
			}
			else if(b[i]==0) {
				al2.add(i);
			}
		}
		int sm = 0;
		int m = al1.size();
		for(int i=0;i<m;i++) {
			sm+=Math.abs(al1.poll()-al2.poll());
		}
		
		
		System.out.println(sm);
		
		

	}

}
