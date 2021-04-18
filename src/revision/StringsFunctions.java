package revision;

public class StringsFunctions {

	public static void main(String[] args) {
	  String students="Karan,Ram,Sham,Gaurav";
	  String studentsSplit[]=students.split(",");
	  
	  
	  for(String studentsList:studentsSplit) {
                System.out.println(studentsList);

	}
	  
	  
	  System.out.println(students.indexOf('a'));
	  System.out.println(students.toLowerCase());
	  

}
}