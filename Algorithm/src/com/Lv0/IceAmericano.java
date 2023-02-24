package com.Lv0;

public class IceAmericano {

	public static void main(String[] args) {
		int money=15000;
		int n = money/5500;
		int changes = money%5500;
		int[] answer = new int[2];
		answer[0] = n; answer [1]= changes;
		for(int i=0; i<2;i++) {
			System.out.println(answer[i]);
		}
		

	}

}
