package oopsRevision;

public class methods {
	
	 static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	static void sayHi() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		
		int result=maxOf(34,65);
		System.out.println(result);
		
		
		sayHi();
	}
}
