package com.javaseleniumstringproblems;

public class ResverseStringProblem {

	public static void main(String[] args) {
		// Write a code to reverse a given string
		
		String data ="Automation Tester";
		String rev ="";
		int i = data.length()-1;
		while(i>=0) {
			rev = rev+data.charAt(i);
			i--;
		}
		System.out.println("Reverse String is:  "+rev);

	}

}
