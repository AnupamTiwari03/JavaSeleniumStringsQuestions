package com.javaseleniumstringproblems;

import java.util.*;

public class FindFrequencyOfChar {
	
	// a code to find how many character repeating how many time

	public static void main(String[] args) {
		String name = "iamanupam";

		char[] newname = name.toCharArray();

		Map<Character, Integer> countChar = new HashMap<Character, Integer>();

		for (char ch : newname) {
			if (countChar.containsKey(ch)) {

				countChar.put(ch, countChar.get(ch) + 1);
			} else {
				countChar.put(ch, 1);
			}
		}

		System.out.println(countChar);

		Iterator<Character> newchar = countChar.keySet().iterator();

		while (newchar.hasNext()) {
			char newch = newchar.next();

			if (countChar.get(newch) > 1) {
				System.out
						.println("character repeating more then one time is  " + newch + " : " + countChar.get(newch));

			}
		}

	}

}
