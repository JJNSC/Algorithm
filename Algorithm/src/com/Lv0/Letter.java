package com.Lv0;

public class Letter {

	public static void main(String[] args) {
		String message ="happy birthday!";  //30
		String message2 ="I love you~"; //22
		int answer=0;
		
		char[] chararray1= message.toCharArray();
		char[] chararray2 = message2.toCharArray();
		
		for(int i =0; i< chararray2.length;i++) {
			answer +=2 ; 
		}
		System.out.println(answer);

	}

}
