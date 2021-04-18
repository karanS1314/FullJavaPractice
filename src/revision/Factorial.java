package revision;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
				int factorialOf=sc.nextInt();
		
				int factorial=1;
				for (int i=1;i <=factorialOf ; i++) {
				factorial=i*factorial;	
				}
System.out.println(factorial);
	}

}
