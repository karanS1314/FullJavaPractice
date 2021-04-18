package oopsRevision.packages;

import oopsRevision.packages.innerpackage.*;

public class MainClass {

	public static void main(String[] args) {
		
		InnerClass2 student2= new InnerClass2("Ashutosh");
		
//		student1 obj maine InnerClass1 mei bhi use kiya tha iska mtlb ki apni limits k andar hi hota hai obj ek defined
//		jaise loop k andr 'i' apni limits mei fir uski bracket khtm hote hi firse use krlo i ko!!!
		
		 
		InnerClass1 student1=new InnerClass1(6);
		System.out.println(student2.getName()+" "+ student1.getheight());

	}

}
