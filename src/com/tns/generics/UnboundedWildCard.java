package com.tns.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCard {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(3,11,2004,5,6);
		System.out.println("Display integer element :");
		UnboundedWildCardDisplay.display(l);
		List<String> s = Arrays.asList("kiran","s","cool");
		System.out.println("Display string element :");
		UnboundedWildCardDisplay.display(s);

	}

}
