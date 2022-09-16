/**
 * 
 */
package com.javaseleniumstringproblems;

/**
 * @author Anupam
 *
 */
public class FindMaxValueInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 23, 5, 6, 29, 56, 90, 10, 50, 2, 0 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest Value in Array is : " + max);

	}

}
