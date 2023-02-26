package com.Lv0;

public class Delete_specific_char {

	public static void main(String[] args) {
		String my_string="BCBdbe";
		char letter = 'B';
		
		char[] newstring = new char[my_string.length()];
		int j=0;
		
		for (int i =0; i<my_string.length();i++) {
			if(my_string.charAt(i)!=letter) {
				newstring[j] = my_string.charAt(i);
				j++;
			}
		}
		
		System.out.println(newstring);
	}

}

