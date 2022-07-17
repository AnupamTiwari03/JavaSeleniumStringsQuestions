package com.javaseleniumstringproblems;

public class ReplaceVowelWithDollar {

	public static void main(String[] args) {
		// Replace vowels with dollar in a given string
		String name = "anupam tiwari";
		char ch[] = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = '$';
			}

		}
		System.out.println(ch);

	}

}
