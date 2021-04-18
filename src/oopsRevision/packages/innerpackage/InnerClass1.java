package oopsRevision.packages.innerpackage;

public class InnerClass1 {
	int height;
	
	public InnerClass1(int height) {
		this.height=height;
	}
	
	public int getheight() {
		return height;
		
	}
	
	private String getPassword() {
		return "ashmeenkaran1";
		
	}

	public static void main(String[] args) {
		InnerClass1 student1=new InnerClass1(5);
		
		System.out.println(student1.getPassword());
		
	}

}
