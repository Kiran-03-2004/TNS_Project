package com.tns.arrays;

public class Wrapper {
	public static void main(String[] args) {
		float f=22.22f;
		//Wrapping
		Float obj=f;
		System.out.println(obj.TYPE);
		float f1=obj.floatValue();
		System.out.println(f1);
}
}