package com.tns.generics;

import java.util.ArrayList;

public class UpperBounded {
	public static Double sumOfList(ArrayList<? extends Number> al) // any subclass of Number class
	{
		double sum = 0.0;
		for (Number n : al) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}
}