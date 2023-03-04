package com.Lv0;

public class SquareOrNot {

	public static void main(String[] args) {
		int n = 976;
		int answer =0;
		for(int i =1; i<=n/2;i++) {
			if(i*i ==n) {
				answer =1;
				break;
			}else {
				answer =2;
			}
		}
		System.out.println(answer);

	}

}
