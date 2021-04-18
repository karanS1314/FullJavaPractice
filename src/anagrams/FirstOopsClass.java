package anagrams;

class Friends{
	String behaviour;
	boolean sober;
	int noOfFriends;
	
	  public void action1() {
		  System.out.println("tatter slapped gaurav");
	  }
	  public void action2() {
		  System.out.println("ruhi slapped ayushi");
		 
	  }
	  public void action3() {
		  System.out.println("ayushi slapped ruhi");
	  }
	  public void me() {
		  System.out.println("me laughing my ass out");
	  }
	  
	  static void sayHii() {
		  System.out.println("hello");
	  }
	  
	  public static void main(String[] args) {
		  
		  sayHii();
	  }
}
	
	




public class FirstOopsClass {
	public static void main(String[] args) {
		
		Friends ashutosh= new Friends();
		Friends me=new Friends();
		
		ashutosh.behaviour= "chutiya";
		ashutosh.sober= true;
		ashutosh.noOfFriends=4;
		
	
		
	me.action1();
	me.action2();
	me.action3();
	me.me();
	
	sayHi();
	
	}

	static void sayHi() {
		
		System.out.println("hello madarchod"); 
	}
		 
	
}
