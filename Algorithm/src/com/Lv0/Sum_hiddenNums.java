package com.Lv0;

public class Sum_hiddenNums {

	public static void main(String[] args) {
		String my_string ="aAb1B2cC34oOp";
		int n = my_string.length();
		int answer  =0;
		
		for(int i=0 ; i<n;i++) {
			if(Character.digit(my_string.charAt(i), 10)>0) {  //my_string.charAt(i)  의 값이 10(10진수)의 숫자중에 하나인지 체크하는것. 그리고 그것이 0보다 큰값인지 확인하는 것.
				answer += Integer.parseInt(String.valueOf(my_string.charAt(i))); // 확인후 true일시 char값을 String.valueof 로 String으로 변환후, Integer.parseInt로 int값으로 변환해서 더해준다.
			}
		}
		
//		for(int i=0; i<n;i++) {
//			if(my_string.charAt(i) =='1') {
//				answer +=1;
//			}else if (my_string.charAt(i) =='2') {
//				answer +=2;
//			}else if (my_string.charAt(i) =='3') {
//				answer +=3;
//			}else if (my_string.charAt(i) =='4') {
//				answer +=4;
//			}else if (my_string.charAt(i) =='5') {
//				answer +=5;
//			}else if (my_string.charAt(i) =='6') {
//				answer +=6;
//			}else if (my_string.charAt(i) =='7') {
//				answer +=7;
//			}else if (my_string.charAt(i) =='8') {
//				answer +=8;
//			}else if (my_string.charAt(i) =='9') {
//				answer +=9;
//			}
//		}
		System.out.println(answer);
	}

}
