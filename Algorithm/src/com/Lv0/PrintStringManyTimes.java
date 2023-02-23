package com.Lv0;

public class PrintStringManyTimes {

	public static void main(String[] args) {
		String myString = "hello";
		int n =3;
		
		String answer ="";
		
		for(int i =0; i <myString.length();i++) {
			for(int j=0; j<n;j++) {
				answer += myString.charAt(i);
			}
			
		}
		System.out.println(answer);

	}

}
