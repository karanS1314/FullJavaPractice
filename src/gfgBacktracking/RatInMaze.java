package gfgBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RatInMaze {
	
	static boolean valid(boolean vis[][],int a[][],int n,int i,int j) {
		if(i<0||i>n-1||j<0||j>n-1||vis[i][j]==true||a[i][j]==0) {
			return false;
		}
		return true;
	}
	
	static void res(ArrayList<String> al,int n,int a[][],boolean vis[][],ArrayList<Character> buf,int i,int j) {
		
		if(!valid(vis,a,n,i,j)) {
			return;
		}
		if(i==n-1 && j==n-1) {
			char temp[]=new char[buf.size()];
			for(int k=0;k<buf.size();k++) {
				temp[k]=buf.get(k);
			}
			al.add(String.valueOf(temp));
			return;
			
		}
		
		vis[i][j]=true;
		if(valid(vis, a, n, i+1, j)) {
		buf.add('D');
		res(al,n,a,vis,buf,i+1,j);
		buf.remove(buf.size()-1);
		}
		
		if(valid(vis, a, n, i-1, j)) {
		buf.add('U');
		res(al,n,a,vis,buf,i-1,j);
		buf.remove(buf.size()-1);
		}
		if(valid(vis, a, n, i, j+1)) {
		buf.add('R');
		res(al,n,a,vis,buf,i,j+1);
		buf.remove(buf.size()-1);
		}
		if(valid(vis, a, n, i, j-1)) {
		buf.add('L');
		res(al,n,a,vis,buf,i,j-1);
		buf.remove(buf.size()-1);
		}
		
		vis[i][j]=false;
		return;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		ArrayList<String> al=new ArrayList<>();
		boolean vis[][]=new boolean[n][n];
		ArrayList<Character> buf=new ArrayList<>();
		
		res(al, n, a, vis, buf, 0, 0);
		Collections.sort(al);
		
		for(int i=0;i<al.size();i++) {

			System.out.print(al.get(i)+ " ");
		}
			
		
	
		
	}

}
