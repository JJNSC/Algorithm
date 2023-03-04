package com.Lv0;

public class Delete_specific_char {

	public static void main(String[] args) {
		String my_string="BCBdbe";
		String letter ="B";
		String answer ="";
		for(int i=0; i<my_string.length();i++) {
			if(my_string.charAt(i) != letter.charAt(0)) {
				answer += my_string.charAt(i);
			}
		}
		
		System.out.println(answer);
	}

}

