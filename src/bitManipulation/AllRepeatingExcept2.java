package bitManipulation;

import java.util.*;

public class AllRepeatingExcept2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();

        int xor=0;
        for(int e : a){
            xor=xor^e;
        }
        int rsbm = xor & -xor;

        int x=0;
        int y=0;
        for(int e:a){
            if((e&rsbm)==0){
                x^=e;
            }
            else{
                y^=e;
            }
        }
        System.out.println(x+ " "+y);
    }
}
