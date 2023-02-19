package com.Lv1;

public class Count_P_Y {

	public static void main(String[] args) {
		String s = "Pyy"; 
		boolean answer = true;
		int cnty=0;
		int cntp=0;
				
		String kys = s.toLowerCase();
		System.out.println(kys);
				
		char[] array = kys.toCharArray();
		System.out.println(array);
		for(char i : array) {
			if(i == 'y') {
				cnty++;
			}else if (i =='p') {
				cntp++;
			}
		}
		if(cntp != cnty) {
			answer =false;  
		}
		System.out.println(answer);

	}  

}
