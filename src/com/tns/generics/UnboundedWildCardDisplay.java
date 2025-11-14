package com.tns.generics;

import java.util.List;

public class UnboundedWildCardDisplay {
	public static void display(List<?> l) {
		for (Object o : l) {
			System.out.println(o);
		}

   }
}
