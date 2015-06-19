package com.test.math;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String input = "435+876576-43+3*5-6*7";

		System.out.println(multiply(input));
	}

	private static String multiply(String input) {
		String temp[] = input.split("(?<=[\\(\\)\\+\\-*\\/\\^A-Za-z])|(?=[\\(\\)\\+\\-*\\/\\^A-Za-z])");
		List<String> a = Arrays.asList(temp);

		System.out.println(input);
		if (a.contains("*")) {
			Equation e = new Equation();
			int i = a.indexOf("*");
			e.left = a.get(i - 1);
			e.right = a.get(i + 1);
			e.op = "*";
			
			input = input.replace(e.getStringOperation(), String.valueOf(Double.valueOf(e.left) * Double.valueOf(e.right)));
			return multiply(input);

		} else if (a.contains("+")) {
			Equation e = new Equation();
			int i = a.indexOf("+");
			e.left = a.get(i - 1);
			e.right = a.get(i + 1);
			e.op = "+";
			
			input = input.replace(e.getStringOperation(), String.valueOf(Double.valueOf(e.left) + Double.valueOf(e.right)));
			return multiply(input);

		} else if (a.contains("-")) {
			Equation e = new Equation();
			int i = a.indexOf("-");
			e.left = a.get(i - 1);
			e.right = a.get(i + 1);
			e.op = "-";
			
			input = input.replace(e.getStringOperation(), String.valueOf(Double.valueOf(e.left) - Double.valueOf(e.right)));
			return multiply(input);
		}
		
		return null;
	}

}

class Equation {
	public String left;
	public String right;
	public String op;

	public String getStringOperation() {
		return left + op + right;
	}
}