package oopsRevision.encapsulationIntro;

public class StudentData {
	private int age;
	String name;
	
	public void setage(int age) {
		if(age>20) {
      System.out.println("not a student");
	}else {
		this.age=age;
		System.out.println(age);
		}
	}

//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
	
}
