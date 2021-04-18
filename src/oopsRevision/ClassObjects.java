package oopsRevision;

 class students{
	String sports;
	int marks,height;
	boolean topper;
	
	
	public void studying() {
		System.out.println("Student is Studying");
	}
	
	public void playing() {
		System.out.println("student is playing");
	}
	
	public void about() {
		System.out.println("student plays "+sports+" and his height is "+height+" is he a topper? "+topper+ " as his marks are "+marks);
	}
}

public class ClassObjects {
	
	public static void main(String[] args) {
		
		students karan=new students();
		students ashutosh=new students();
		
		karan.playing();
		ashutosh.studying();
		
		karan.height=6;
		karan.sports="cricket";
		karan.topper=false;
		
		ashutosh.height=5;
		ashutosh.topper=true;
		ashutosh.marks=50;
		
		ashutosh.about();
		karan.about();
		
//		****
		System.out.println(methods.maxOf(45, 4));
		
		
	}

}
