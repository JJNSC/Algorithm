package com.Lv1;

public class StringToInteger {
	public static void main(String[] args) {
		int answer =0;
		
		String a = "-1234";
		
		String[] arra = a.split("");
		
		if(arra[0]=="-") {
			for(int i =1; i<arra.length;i++) {
				answer = answer*10 + Integer.parseInt(arra[i]);
			}
			answer = answer*(-1);
		}else {
			answer = Integer.parseInt(a);
		}
		
		System.out.println(answer);
	}
}
