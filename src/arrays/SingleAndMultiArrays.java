package arrays;
import java.util.Scanner;
public class SingleAndMultiArrays {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter no of students ");
		int n=sc.nextInt();
		
		System.out.println("enter roll no wise marks ");
		
		int[] marks=new int[n];
		int average=0;
		
		for(int i=0;i<n;i++) {
			
			marks[i]=sc.nextInt();
			
		average+=marks[i];
		
		}
		average/=n;
		System.out.println("average of the marks is " + average);
		
		
		
		
		
		
		
	}

}
