package oopsRevision;


class Vehicle{
	int wheels;
	int headlights;
	String color;
	
	Vehicle(){
	}
	
	Vehicle(int wheels){
		this.wheels=wheels;
		headlights=2;
		color="not specified";
	}
	
	Vehicle(int wheels,String color){
		this.wheels=wheels;
		this.color=color;
		headlights=2;
	}
	
//	static me static public mei public
	
	void about() {
		System.out.println(wheels +" "+ color +" "+ headlights);
	}
	
}
public class MyConstructor {
	

	public static void main(String[] args) {
		
		Vehicle car=new Vehicle(4,"red");
		Vehicle bike=new Vehicle(2);
		Vehicle rikshaw=new Vehicle();
		
		car.about();
		bike.about();
		rikshaw.about();

	}

}
