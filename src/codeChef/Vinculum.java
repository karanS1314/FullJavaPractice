package codeChef;

import java.util.HashMap;
import java.util.Scanner;

 class Vinculum {

	 static String decimal(int numerator,int denominator) {
		 
		 String result = "";
		 
			
			long num = numerator, den = denominator;
			num = Math.abs(num);
			den = Math.abs(den);
		 
			long res = num / den;
			result += String.valueOf(res);
		 
			long remainder = (num % den) * 10;
			if (remainder == 0)
				return result;
		 
			HashMap<Long, Integer> map = new HashMap<Long, Integer>();
			result += ".";
			while (remainder != 0) {
				
				if (map.containsKey(remainder)) {
					int beg = map.get(remainder); 
					String part1 = result.substring(0, beg);
					String part2 = result.substring(beg, result.length());
					result = part1 + "[" + part2 + "]";
					return "vinculum "+ result;
				}
		 
				
				map.put(remainder, result.length());
				res = remainder / den;
				result += String.valueOf(res);
				remainder = (remainder % den) * 10;
			}
		 
			return "regular " +result;
		}
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNext()) t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			
			String s="";
		    if(sc.hasNext()) s=sc.next();
		    
		   int m= s.indexOf('/');
		   
		   int p=Integer.parseInt(s.substring(0,m));
		   int q=Integer.parseInt(s.substring(m+1));
		
			System.out.println(decimal(p,q));
	}

}
}
