package com.Lv0;

public class Ant_Army {

	public static void main(String[] args) {
		int n = 999;
		int answer =0;
		while(n>=5) {
			n -= 5;
			answer +=1;
		}
		if(n== 4 || n==2) {
			answer +=2;
		}else if(n ==3 || n==1) {
			answer +=1;
		}
		System.out.println(answer);
	}

}
