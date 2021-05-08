package NewAlgos.KMP;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String p = sc.nextLine();

        int lps[] = new int[p.length()];

        int l = 0;
        int r = 1;

        while(l < p.length() && l < r && r < p.length()){
            if(p.charAt(l) == p.charAt(r)){
                lps[r] = l + 1;
                l++;
                r++;
            }
            else{
                if(l > 0)
                    l = lps[l - 1];
                else
                    r++;    
            }
        }

        boolean found = false;

        int i = 0;
        int j = 0;

        while(i < s.length() - p.length() + 1){
            if(s.charAt(i) == p.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j != 0){
                    j = lps[j - 1];
                }
                else{
                    i++;
                }
            }

            if(j == p.length()){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("PRESENT");
        }
        else{
            System.out.println("NOT PRESENT");
        }

    }
}
