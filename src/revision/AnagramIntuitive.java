package revision;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramIntuitive {

	public static void main(String[] args) {
		
//		AnagramBasic obj= new AnagramBasic();
//		ye kr skte hain kyuki ek package ke andar alag alag public classes doosri public class mei accesible hain!
     
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
		String a=sc.next();
        String b=sc.next();
        
        
        boolean isAnagram=true;
        if(a.length()!=b.length()) {
        	isAnagram=false;
        }
        else {
        int al[]=new int[256];
        char d[]=a.toCharArray();
        Arrays.sort(d);
        char e[]=b.toCharArray();
        Arrays.sort(e);
        
        for(char c:d) {
        	int index=(int) c;
        	al[index]++;
        	
        }
        
        for(char c:e) {
        	int index=(int) c;
        	al[index]--;
        	
        }
        
        for(int i=97;i<123;i++) {
        	if(al[i]!=0) {
        		isAnagram=false;
        		break;
        	}
        }
        }
        if(isAnagram) {
      	   System.out.println("YES");
         }
         else {
      	   System.out.println("NO");
         } 

	}
	}
}
