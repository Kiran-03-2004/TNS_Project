package com.tns.generics;

public class GenerticClassTest {
	public static void main(String[] args) {
		GenericClass<Integer> i = new GenericClass<>();
		i.setData(1);
		System.out.println("integer stored and accesed in generics :"+i.getData());
		GenericClass<String> s = new GenericClass<>();
		s.setData("Kiran");
		System.out.println("String stored and accesed using generics :" + s.getData());
		GenericClass<Float> f = new GenericClass<>();
		f.setData(3.11f);
		System.out.println("float stored and accesed using generics :"+f.getData());
	}
}
