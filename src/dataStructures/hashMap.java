package dataStructures;

import java.util.Map;
import java.util.HashMap;

public class hashMap {
	static int getHash(String s) {
		int hash=0;
		for(int i=0;i<s.length();i++) {
			hash+=(int)s.charAt(i);
		}
		return hash;
	}

	public static void main(String[] args) {
		
//        Map<String ,Integer> m= new HashMap<>();
//        m.put("one",1);
//        m.put("two", 2);
		System.out.println(getHash("DOG"));
	}
            
	
}
