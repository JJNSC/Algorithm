package com.Lv0;

public class Sum_digits {

	public static void main(String[] args) {
		int n =930211;
		int answer =0;
		while(n>=1) {
			answer += n%10;
			n = n/10;
		}
		System.out.println(answer);

	}

}
