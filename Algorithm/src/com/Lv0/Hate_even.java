package com.Lv0;

import java.util.Arrays;

public class Hate_even {

	public static void main(String[] args) {
		double n  = 15;
		int a = (int)Math.ceil(n/2);
		int[] answer = new int[a];
		int i=0;
		int j=1;
		while(j<=n) {
			answer[i] = j;
			i ++;
			j +=2;
		}
		for(int k=0; k<answer.length;k++) {
			System.out.println(answer[k]);
		}
	}

}
