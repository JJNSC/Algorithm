package com.Lv0;

public class Make_MaximunNum {

	public static void main(String[] args) {
		int[] numbers = {0, 31, 24, 10, 1, 9};
		
		for(int i=0; i<numbers.length;i++) {
			for(int j=0; j<i;j++) {
				if(numbers[j]> numbers[i]) {
					int temp=numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		int m1 = numbers[numbers.length-1] , m2=numbers[numbers.length-2];
		int answer = m1*m2;
		System.out.println(answer);

	}

}
