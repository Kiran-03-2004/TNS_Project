package com.tns.generics;

public class GenericsMethodDisplay {
	public <E> void displayArrayElements(E[] elements) {
		   for(E e:elements) {
			   System.out.println("Element is "+e);
		   }
}
}
