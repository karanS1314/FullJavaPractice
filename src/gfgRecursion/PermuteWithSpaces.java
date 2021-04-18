package gfgRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PermuteWithSpaces {
	 static void strings(String s, char buff[],int n,int i,int j,ArrayList<String> al){
	        
	        if(i==n){
	            buff[j]='\0';
	            al.add(String.valueOf(buff));
	            return;
	        }
	           
	        buff[j]=s.charAt(i);
	        strings(s,buff,n,i+1,j+1,al);
	        
	        
	        buff[j]=' ';
	        buff[j+1]=s.charAt(i);
	        strings(s,buff,n,i+1,j+2,al);
	        return;
	    }
	    
		public static void main (String[] args) {
			Scanner sc=new Scanner (System.in);
			int t=sc.nextInt();
			sc.nextLine();
			while(t-->0){
			    String s=sc.nextLine();
			    int n=s.length();
			    ArrayList<String> al=new ArrayList<>();
			    char buff[]=new char[2*n];
			    buff[0]=s.charAt(0);
			    strings(s,buff,s.length(),1,1,al);
			    
			    StringBuffer ans=new StringBuffer("");
			    for(int i=al.size()-1;i>-1;i--){
			        ans=ans.append("(");
			        ans=ans.append(al.get(i).trim());
			        ans=ans.append(")");
			    }
			    System.out.println(ans);
			}
}
}
