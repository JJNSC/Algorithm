package com.Lv0;

public class Cut_Array {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		int num1=1;
		int num2=3;
		int[] answer = new int[num2-num1+1];
		int j=0;
		for(int i =num1; i<=num2;i++) {
			answer[j]=numbers[i];
			j++;
		}
		System.out.println(answer);
	}

}
