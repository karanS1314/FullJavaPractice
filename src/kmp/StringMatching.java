package kmp;

public class StringMatching {
    public static void main(String[] args) {

        String t = "aabaaabaaac"; // -->i
        String s = "aabaaac"; // -->j

        int m = t.length();  
        int n = s.length();

        //* expected output == 5

        // search if any of the substrings of t matches with s

        // brute force -> generate all substrings of t and then match / using two pointers -> O(n^2)

        // using kmp -> O(s.length() + t.length()) ->O(s.length())[space]
        //* generate presuf/LPS array of string s
        //* iterate efficiently in s and t

        int presuf[] = new int[n];

        generatePresuf(presuf , s , n);

        int i = 0;
        int j = 0;
        int matchStartPos = -1;
        while(j < n && i < m){
            if(s.charAt(j) == t.charAt(i)){
                j++;
                i++;
            }
            else{
                if(j > 0){
                    j = presuf[j - 1];
                }
                else if(j == 0){
                    i++;
                }
            }

            if(j == n){
                matchStartPos = i - n;
                break;
            }
        }

        System.out.println(matchStartPos);
    }

    static void generatePresuf(int presuf[] , String s , int n){  // O(n)
        for(int i = 1; i < n; i++){
            int j = presuf[i - 1];

            // abcx.abcd
            // x != d and now j is 3
            // j == presuf[2] i.e. 0
            // for d the presuf[ind] should be 0 
            while(j > 0 && s.charAt(j) != s.charAt(i)){
                j = presuf[j - 1];
            }

            // ab..ab
            // presuf[i - 1] = 1;
            // b == b -> presuf[i] = presuf[i - 1] + 1;
            if(s.charAt(j) == s.charAt(i)){
                j++;
            }
            presuf[i] = j;
        }
    }
}
