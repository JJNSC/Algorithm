package com.Lv0;

public class Get_MiddleNumber {

	public static void main(String[] args) {
		int[] array = {2, 1, 10, 7, 11};
		int[] array2 = {9, -1, 0};
		int n = array.length/2;
		
		for(int i =0; i<array.length;i++) {
			for(int j=0; j<i; j++) {
				if(array[i]<array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i =0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		int answer = array[n];
		System.out.println(answer);
		

	}

}
