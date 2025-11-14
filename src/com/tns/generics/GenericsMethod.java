package com.tns.generics;

public class GenericsMethod {

	public static void main(String[] args) {
		Integer[] i = {3,11,2004};
		String[] s = {"Kiran","S"};
		Float[] f = {3.11f,20.04f};
		GenericsMethodDisplay g = new GenericsMethodDisplay();
		g.displayArrayElements(i);
		g.displayArrayElements(s);
		g.displayArrayElements(f);
		

	}

}
