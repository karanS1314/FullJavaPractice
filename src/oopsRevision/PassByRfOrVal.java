package oopsRevision;

class Dog{
	String breed;
	int legs;
	
}

public class PassByRfOrVal {
	
	
	
	public static void main(String[] args) {
		
		Dog a=new Dog();
		Dog b=new Dog();
		
//		a.legs=3;
//		b.legs=4;
//		
//		change(a,b);
//		
//		System.out.println(b.legs); output will be 4 here!
//		
		a.legs=3;
		
		changeDogState(a);
		System.out.println(a.legs);
		
//       but yahi agar primitive datatypes pe ye method apply
//       kiya hota to a ke legs ki value 3 hi rehti
//       
//       for eg   
       int n=5;
    		   
       changePrimitive(n);
    		   System.out.println(n);
		
	}
	static void change(Dog c,Dog d){
		Dog temp=c;
		c=d; 
		d=temp;		
	}
	
	static void changeDogState(Dog e) {
		e.legs=5;
	}
	
	static void changePrimitive(int b) {
		b=b+2;
	}

}
