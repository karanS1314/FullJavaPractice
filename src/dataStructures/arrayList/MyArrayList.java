package dataStructures.arrayList;

import java.util.ArrayList;

import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		Object x[]= fruits.toArray();
		String y[]=new String[fruits.size()];
		fruits.toArray(y);
		for(Object e:x) {
			System.out.println(e);
		}
		fruits.re
		for(String f:y) {
			System.out.println(f);
		}
	}

}
