package com.Lv0;

public class Count_even_odd {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		
		int[] answer =new int[2];
		int even =0, odd=0;
		for(int i =0; i <num_list.length;i++) {
			if(num_list[i]%2 ==0) {
				even++;
			}else {
				odd++;
			}
		}
		answer[0] = even;
		answer[1] = odd;
		for(int i=0;i<2;i++) {
			System.out.println(answer[i]);
		}
	}

}
