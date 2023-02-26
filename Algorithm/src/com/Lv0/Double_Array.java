package com.Lv0;

public class Double_Array {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 100, -99, 1, 2, 3};
		
		int[] answers = new int[numbers.length];
		
		for(int i =0 ; i< numbers.length;i++) {
			answers[i]= numbers[i]*2;
		}
		for(int i =0 ; i< numbers.length;i++) {
			System.out.println(answers[i]);
		}
		
	}

}
