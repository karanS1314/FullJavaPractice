package gfgQueue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class GenerateBinary {
	
	static void binaryNum(int n) {
		int temp=n;
		ArrayDeque<Integer> a=new ArrayDeque<>();
		while(temp>0) {
		int m=temp%2;
		
		a.push(m);
		temp/=2;
		
		}
		while(!a.isEmpty()) {
			System.out.print(a.pop());
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
			binaryNum(i);
			System.out.print(" ");
			}
		}
	}

}
