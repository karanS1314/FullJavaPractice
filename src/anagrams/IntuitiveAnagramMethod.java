package anagrams;

public class IntuitiveAnagramMethod {

	public static void main(String[] args) {
		
		String a="abot";
		String b="abo";
		
		
		
		boolean isAnagram=true;
		int cl[]=new int [256];
		
		
		for(char c : a.toCharArray()) {
			int index=(int) c;
			cl[index]++;
		}
		
		for(char c : b.toCharArray()) {
			int index=(int) c;
			cl[index]--;
		}
		
		
		for(int i=0;i<256;i++) {
			if(cl[i] != 0) {
				isAnagram=false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("not Anagram");
		}
		
	}

}
