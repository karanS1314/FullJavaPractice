package oopsRevision.StaticKeyword;

import oopsRevision.StaticKeyword.A.B;
import oopsRevision.StaticKeyword.A.C;

public class StaticTesting {

	public static void main(String[] args) {
		
		A objA=new A();
		B objB=objA.new B();
		
		C objC=new A.C();
		
		

	}

}
