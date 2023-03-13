package com.Lv0;

public class Game_369 {
    public static void main(String[] args) {
        int order =29423;
        int answer=0;
        while(order>0){
            int a =order%10;
            if(a==3 || a==6 || a==9){
                answer++;
            }
            order /=10;
        }
        System.out.println(answer);
    }
}
