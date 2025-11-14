package com.tns.generics;

import java.util.List;

public class UnboundedWildCardDisplay {
	public static void display(List<?> l) {
		for (var o : l) {
			System.out.println(o);
		}

   }
}
