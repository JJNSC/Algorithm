package com.Lv0;

public class Similarity_between_twoArrays {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int answer =0;
		for(int i=0; i<s1.length;i++) {
			for(int j=0; j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {  // 여기서는 먹히지만 프로그래머스에서는 s1[i] == s2[j] 는 0으로 결과값이 오류가 난다.
					answer++;
				}
			}
		}
		System.out.println(answer);

	}

}
