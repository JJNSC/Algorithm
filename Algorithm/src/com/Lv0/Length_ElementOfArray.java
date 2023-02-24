package com.Lv0;

public class Length_ElementOfArray {

	public static void main(String[] args) {
		String[] strlist= {"We", "are", "the", "world!"};
		int[] answer = new int[strlist.length];
		for(int i=0; i<strlist.length;i++) {
			answer[i] = strlist[i].toCharArray().length;
		}
		for(int i=0; i<strlist.length;i++) {
			System.out.println(answer[i]);
		}
	}

}
