package com.Lv0;

public class Discount_ClothShop {

	public static void main(String[] args) {
		int price =580000;
		int answer=0;
		if(price <100000) {
			answer = price;
		}else if(price>=100000 && price <300000) {
			answer = (int)Math.floor(price*0.95) ;
		}else if( price>=300000 && price <500000) {
			answer = (int)Math.floor(price*0.9) ;
		}else {
			answer = (int)Math.floor(price*0.8) ;
		}
		System.out.println(answer);
	}

}
