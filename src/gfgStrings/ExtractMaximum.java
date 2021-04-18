package gfgStrings;
import java.util.Scanner;

public class ExtractMaximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s=sc.nextLine();
			int num=0;
			int res=0;
			
			for(int i=0;i<s.length();i++) {
				if(Character.isDigit(s.charAt(i))) {
					num=num*10 + (s.charAt(i)-'0');
				}
				else {
					res=Math.max(res,num);
					num=0;
				}
			}
			int ans=Math.max(res, num);
			System.out.println(ans);
			}
		}
	}


