package dataStructures;

import java.util.HashSet;
import java.util.Set;

public class HashcodeAndEquals {

	public static void main(String[] args) {
		
		Pen p1=new Pen(10,"red");
		Pen p2=new Pen(10,"red");
		
		System.out.println(p1.equals(p2));
		
		Set<Pen> pens=new HashSet<>();
		pens.add(p1);
		pens.add(p2);
		System.out.println(pens);
	}

}
class Pen{
	int price;
	String color;
	
	Pen(int price, String color){
		this.price=price;
		this.color=color;
	}
	@Override
	public boolean equals(Object obj) {
		Pen that=(Pen)obj;
		
		return (this.price==that.price && this.color.equals(that.color));
	}
	@Override
	public int hashCode() {
		return price+color.hashCode();
	}
}
