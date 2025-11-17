package com.tns.lambdaexpression;

public class UsingNewWay {
	public static void main(String[] args) {
		Mycube c = (int no) -> {
			return no*no*no;
		};
		System.out.print("Using Lambda Expression :"+c.getCude(3));
	}
}
