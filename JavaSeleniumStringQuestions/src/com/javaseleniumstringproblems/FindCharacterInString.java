package com.javaseleniumstringproblems;

public class FindCharacterInString {

	public static void main(String[] args) {
		// find how many character are present inside string

		String data = "Automation Tester";
		int count = 0;

		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) != ' ') {
				count = count + 1;
			}

		}
		System.out.println("No of Character in a given string is : "+ count);

	}
}
