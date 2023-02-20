package com.Lv1;

public class HashadeNum {
	public static void main(String[] args) {
		int x =10;
		boolean answer = true;
		int a=0;
		int temp=x;
		//System.out.println(x+","+a);
		for(int i=0; temp>0 ;i++) {
			a = a+(temp%10);
			temp=temp/10;
			}
		if(x%a==0) {
			answer=true;
		}else {
			answer=false;
			}              
	    System.out.println(answer);
 
	}    
}
