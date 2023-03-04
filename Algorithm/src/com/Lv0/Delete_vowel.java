package com.Lv0;

public class Delete_vowel {

	public static void main(String[] args) {
		String my_string="nice to meet you";
		String answer =""; 
		for(int i =0; i<my_string.length();i++) {
			
			if(my_string.charAt(i) != 'a' && my_string.charAt(i) !='e' &&my_string.charAt(i) != 'i'&&my_string.charAt(i) != 'o'&&my_string.charAt(i) != 'u') {
				answer += String.valueOf(my_string.charAt(i));
			}
		}
		System.out.println(answer);
	}

}
