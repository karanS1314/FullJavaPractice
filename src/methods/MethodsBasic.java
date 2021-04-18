package methods;

public class MethodsBasic {
	
	static int maxOf(int a,int b) {
				return a>b?a:b;
		
	}
	static String getPassword() {
		return "ashmeenkaran";
	}
	public static void main(String[] args) {
		
		int firstNumber=34;
		int secondNumber=38;
		
		int result=maxOf(firstNumber,secondNumber);
		maxOf(100,23);
		System.out.println(result);
		
		
		
		getPassword();
		
		
	
		
	}

}
