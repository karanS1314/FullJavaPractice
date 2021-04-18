package gfgRecursion;

import java.util.Scanner;
import java.util.Stack;

public class SortStack {
	public static Stack<Integer> sort(Stack<Integer> s)
	{
	    if(s.size()==1){
	        return s;
	    }
	    
	    int m=s.pop();
	    sort(s);
	    insert(s,m);
	    return s;
	}
	public static void insert(Stack<Integer> s, int temp){
	    if(s.size()==0){
	        s.push(temp);
	        return;
	    }
	    if(temp>s.peek()){
	        s.push(temp);
	        return;
	    }
	    int m1=s.pop();
	    insert(s,temp);
	    s.push(m1);
	    return;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
	        Stack<Integer> st=new Stack<>();
	        for(int i=0;i<n;i++) {
	        	st.push(sc.nextInt());
	        }
	        
	        sort(st);
	        for(int i=0;i<n;i++) {
	        	System.out.print(st.pop()+ " ");
	        }
	        
		}

	}

}
