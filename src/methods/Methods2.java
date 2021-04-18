package methods;

public class Methods2 {
	
	public static void main(String[] args) {
		int c=25;
		int d=2;
		
	
		swap(c,d);
		System.out.println(c + " " + d);
		
	}
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		
	}
		
	

}
