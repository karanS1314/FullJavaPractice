package oopsRevision.interfaces;

public class Person implements Youtuber,Student {
	String name;
	
	public Person(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		
         Person obj=new Person("Karan");
         obj.study();
         obj.makeVideos();
	}

	@Override
	public void study() {
		System.out.println(name+" is studying ");
		
	}

	@Override
	public void makeVideos() {
		System.out.println(name + " is making videos ");
		
	}

}
