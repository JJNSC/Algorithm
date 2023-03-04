package com.Lv0;

public class Small_Letter_Capital_Letter {

	public static void main(String[] args) {
		String my_string ="abCdEfghIJ";
		String answer = "";
		
		for(int i=0; i<my_string.length();i++) {
			if((int)(my_string.charAt(i)) >=65 && (int)(my_string.charAt(i)) <91) {
			   answer +=String.valueOf((char)((int)(my_string.charAt(i))+32));
			  
			}else if((int)(my_string.charAt(i)) >=96 && (int)(my_string.charAt(i))<=122) {
				answer +=  String.valueOf((char)((int)(my_string.charAt(i))-32)) ;
			}
		}
		System.out.println(answer);
	}

}
