package com.Lv0;

public class Dots_Position {

	public static void main(String[] args) {
		int[] dot = {-2,-3};
		int answer =0;
		if(dot[0]>0) {
			if(dot[1]>0) {
				answer = 1;
			}else if(dot[1] <0) {
				answer = 4;
			}
		}else if(dot[0]<0) {
			if(dot[1]>0) {
				answer = 2;
			}else if(dot[1] <0) {
				answer = 3;
			}
		}
		System.out.println(answer);
	}

}
