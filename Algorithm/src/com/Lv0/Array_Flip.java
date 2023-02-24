package com.Lv0;

public class Array_Flip {

	public static void main(String[] args) {
		int[] num_list = {1,0,1,1,1,3,5};
		int[] answer= new int[num_list.length];
		int length = num_list.length;
		
		for(int i =0; i<length; i++) {
			answer[i] = (int)num_list[length-1-i];
		}
		System.out.println(answer);
	}

}
