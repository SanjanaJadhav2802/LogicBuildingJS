package com.Question.Others;

public class FindLengthOfLastWordinString {

	public static void main(String[] args) {
		String s1 = "   Hello    World   sanjana";
		int count = 0;

		// Trim
		s1 = s1.trim();

		// Convert to char Array
		char[] charArray = s1.toCharArray();

		for (int i = (charArray.length) - 1; i >= 0; i--) {
			if (charArray[i] != ' ') {
				count = count + 1;
				// System.out.print(charArray[i]);
			}

			else {
				if (count > 0) {  //we can skip trim method

					break; // Break when we find out last word

				}
			}

		}
		System.out.println("Length of last word in String is " + count);

	}

}
