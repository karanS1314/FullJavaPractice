package rough;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.io.InputStreamReader;


public class StringsRough {
	public static void main(String[] args)  throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
	
		while(t-->0){
		  //  int n=Integer.parseInt(br.readLine());
		    
		  //  int k=Integer.parseInt(br.readLine());
		    String line1=br.readLine();
		    String s2[] = line1.split(" ");
		    int n=Integer.parseInt(s2[0]);
		    int k=Integer.parseInt(s2[1]);
		    long a[]=new long[n];
		    String line=br.readLine();
		    String s1[] = line.split(" ");
            for(int i=0;i<n;i++)
                  {
                      a[i]=Long.parseLong(s1[i]);
                   }
		    
		    
		   for(int i=0;i<n;i=i+k){
		       int l=i;
		       int r=Math.min(i + k - 1, n - 1);
		       while(l<r){
		       long temp=a[l];
		       a[l]=a[r];
		       a[r]=temp;
		       l++;
		       r--;
		       }
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(a[i]+ " ");
		    }
		    System.out.println();
		 
		}
		}
	
}
