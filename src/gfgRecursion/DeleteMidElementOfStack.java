package gfgRecursion;

import java.util.Stack;

public class DeleteMidElementOfStack {
	public static Stack<Integer> deleteMid(Stack<Integer>st,int n,int i)
    {
        if(i==n/2){
            st.pop();
            return st;
        }
        
        int m= st.pop();
        i++;
        deleteMid(st,n,i);
        st.push(m);
        return st;
    } 
	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		
		deleteMid(st, 3, 0);

		while(!st.isEmpty()) {
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}

}
