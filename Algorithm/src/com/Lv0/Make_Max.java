package com.Lv0;

public class Make_Max {
    public static void main(String[] args) {
        int[] numbers = {1,2,-3,4,-5};
        int answer =numbers[0]*numbers[1];
        for(int i=0; i<numbers.length-1;i++){
            for(int j=i+1; j<numbers.length;j++){
                int temp = numbers[i] * numbers[j];
                if(temp >= answer){
                    answer = temp;
                }
            } 
        }
        System.out.println(answer);
    }
}
