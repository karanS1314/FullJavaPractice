package oopsRevision.packages.innerpackage;

public class InnerClass2 {
	String name;
	
//	public lgana zruri?!! vrna main class mei ye class import kr ra hu to aara hai contructor not accesible?!!
//	han kyuki default mei ye khud k package tk saari classes ko accessible hoga but agar
//	main class mei krunga to restricted hoga
	
	public  InnerClass2(String name) {
		this.name=name;
	}
	 
//	 static kyu ni lga? kyuki ye static lgadunga to InnerClass2 vali class ke andar hi bn ke reh
//	jayega bs to isko doosri class mei
	 public String getName() {
		 return name;

	 }
	 
	 
	
	public static void main(String[] args) {
		InnerClass2 Student= new InnerClass2("Karan");
		
		System.out.println(Student.getName());
		
		

	}

}
