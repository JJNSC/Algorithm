package com.Lv0;

public class Count_Duplicated_nums {

	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,5};
		int n =1;
		int answer =0;
		
		for(int i=0; i<array.length;i++) {
			if(array[i] == n) {
				answer ++;
			}
		}
		System.out.println(answer);

	}

}
