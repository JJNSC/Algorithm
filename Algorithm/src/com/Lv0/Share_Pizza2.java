package com.Lv0;

public class Share_Pizza2 {
    public static void main(String[] args) {
        int n =10;
        int answer=1;
        for(; ;answer++){
            if(answer*6%n ==0){
                break;
            }
        }
        System.out.println(answer);
    }
}
