package oopsRevision.generics;

public class MainClass {

	public static void main(String[] args) {
		
		Pair<Integer,Integer> p1=new Pair(21,31);
		Pair<Double,Float> p2=new Pair(45555.60,45.67F);
         
		p1.getDescription();
		p2.getDescription();
		
		
		System.out.println(Math.abs(-779%34)+ " "+Math.abs(0)+ " "+(167%34));
	}

}
