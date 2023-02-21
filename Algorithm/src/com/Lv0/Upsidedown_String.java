package com.Lv0;

public class Upsidedown_String {

	public static void main(String[] args) {
		String my_string = "bread";
		char[] letter = my_string.toCharArray();
		System.out.println(letter);
		int length = letter.length;
		char[] result = new char[length];

		for (int i = 0; i < length; i++) {
			result[i] = letter[length - i - 1];
			System.out.println(result[i]);
		}
		System.out.println(result);
		String answer = new String(result);
		System.out.println(answer);

	}

}
