package com.Lv1;

public class CollatzNumber {

	public static void main(String[] args) {
		int num1 = 626331;
		int cnt =0;
		long num = num1;
		
		if (num ==1) {
			System.out.println(cnt);
		}
		
		while(cnt<500) {
			num = (num%2 == 0) ? num/2 : num*3+1; //조건으로  다음 num의 값을 정하자.
			cnt ++;
			if(num ==1) {
				break;
			}
		}  
		
		if(num ==1) {
			System.out.println(cnt);
		}
		else if(num != 1) {
			System.out.println(-1);
		}
	}

}
