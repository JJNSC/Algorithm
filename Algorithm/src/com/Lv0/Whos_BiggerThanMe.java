package com.Lv0;

public class Whos_BiggerThanMe {

	public static void main(String[] args) {
		int [] array = {149, 180, 192, 170};
		int height =167;
		int answer =0;
		for(int i=0; i<array.length;i++) {
			if(array[i]>height) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
