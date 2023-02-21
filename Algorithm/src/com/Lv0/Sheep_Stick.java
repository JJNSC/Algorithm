package com.Lv0;

public class Sheep_Stick {

	public static void main(String[] args) {
		int n =64;
		int k =6;
		int answer = 0;

		int cnt = n / 10;

		answer = 12000 * n + 2000 * (k - cnt);

		System.out.println(answer);
	}
}
