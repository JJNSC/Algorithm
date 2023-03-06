package com.Lv0;

public class StringInString {

	public static void main(String[] args) {
		String str1 ="ab6CDE443fgh22iJKlmn1o";
		String str2 ="6CD";
		int answer =2;
		int cnt=0;
		
		String sample ="";
		sample += str1;
		System.out.println("sample 이전:"+sample);
		sample.replace(str2,"");
		System.out.println("sample 이후:"+sample);
		
//		for(int i =0 ; i<str1.length()-str2.length();i++) {
//			cnt =0;
//			for(int j=0; j<str2.length();j++) {
////				System.out.println("str1.charAt(i+j) : "+str1.charAt(i+j));
////				System.out.println("str2.charAt(j) : "+str2.charAt(j));
//				if(str1.charAt(i+j) == str2.charAt(j)) {
//					cnt ++;
//					if(cnt == str2.length()) {
//						answer =1;
//						break;
//					}
//				}
//			}
//		}

		System.out.println(answer);
	}

}
