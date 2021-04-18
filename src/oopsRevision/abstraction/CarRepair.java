package oopsRevision.abstraction;

public class CarRepair {
	
	public static void  carRepair(Cars car) 
	{
		System.out.println("car repaired");
		
	}
	

	public static void main(String[] args) {
		WagonR wagonr=new WagonR();
		Audi audi=new Audi();
		
		carRepair(wagonr);
		carRepair(audi);
		
		wagonr.acc();
		audi.breaking();
	}

}
